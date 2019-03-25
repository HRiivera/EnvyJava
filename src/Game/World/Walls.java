package Game.World;

import Main.Handler;

import java.awt.*;


/**
 * Two types of walls:
 * 	. InvisibleWalls
 * 	. EntranceWalls
 *
 */
public class Walls extends Rectangle {

    protected Handler handler;
    protected int originalX,originalY;
    protected String wallType;
    protected Rectangle upWall;
    protected Rectangle downWall;
    protected Rectangle leftWall;
    protected Rectangle rightWall;
    
    public Walls(Handler handler, int x, int y, int width, int height, String wallType) {
        super(x, y, width, height);
        
        originalX = x;
        originalY = y;
        this.handler = handler;
        this.wallType = wallType;
        
        upWall = new Rectangle(this.x,this.y-10,width,10);
        downWall = new Rectangle(this.x,this.y+height,width,10);
        leftWall = new Rectangle(this.x-10,this.y,10,height);
        rightWall = new Rectangle(this.x+width,this.y,10,height);
        

    }

    public void tick(){
        this.x = handler.getXDisplacement() + originalX;
        this.y = handler.getYDisplacement() + originalY;
        
        upWall.x = originalX + handler.getXDisplacement();
        upWall.y = originalY-10 + handler.getYDisplacement();
        
        downWall.x = originalX + handler.getXDisplacement();
        downWall.y = originalY+height + handler.getYDisplacement();
        
        leftWall.x = originalX-10 + handler.getXDisplacement();
        leftWall.y = originalY + handler.getYDisplacement();
        
        rightWall.x = originalX+width + handler.getXDisplacement();
        rightWall.y = originalY + handler.getYDisplacement();
        
        
        
        
    }

    public void render(Graphics2D g2){
        g2.draw(this);
    }

    public String getType() {
    	
    	return wallType;
    }
    
    public Rectangle getUpWall() {
    	return upWall;
    }
    
    public Rectangle getDownWall() {
    	return downWall;
    }
    
    public Rectangle getLeftWall() {
    	return leftWall;
    }
    
    public Rectangle getRightWall() {
    	return rightWall;
    }
    
    
    
    
    
}
