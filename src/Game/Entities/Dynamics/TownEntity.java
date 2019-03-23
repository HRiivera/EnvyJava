package Game.Entities.Dynamics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import Game.Entities.Statics.BaseStaticEntity;
import Main.Handler;
import Resources.Images;
import javafx.scene.input.KeyCode;

public class TownEntity extends BaseStaticEntity {
	
	Rectangle collision;
	int width, height;
	public Boolean EP = false;
	public Boolean HI = true;
	private Rectangle ir = new Rectangle();
	private int originalX;
	private int originalY;
	public Boolean text=false;
	
	
	public TownEntity(Handler handler, int xPosition, int yPosition, BufferedImage townEntity) {
		super(handler, xPosition, yPosition);
		width = 100;
		height = 100;
		
		this.setXOffset(xPosition);
		this.setYOffset(yPosition);
		
		ir.x=xPosition;
		ir.y=yPosition;
		ir.width = 32;
		ir.height = 55;
		
		 originalX=xPosition;
		 originalY=yPosition;
		
		
	
	

		
		collision = new Rectangle();
	}
	
	



	@Override
	public void render(Graphics g) {
		
		g.drawRect(ir.x, ir.y, ir.width+25, ir.height+25);
		
		if (HI) {
			g.drawImage(Images.TownEntity, (int)(handler.getXDisplacement() + xPosition),(int)( handler.getYDisplacement() + yPosition), width, height, null);
			collision = new Rectangle((int)(handler.getXDisplacement() + xPosition + 35), (int)(handler.getYDisplacement() + yPosition + 50), width/4, height/2);
			
			
	    	
		} else {
			g.drawImage(Images.TownEntity, (int)(handler.getXDisplacement() + xPosition),(int)( handler.getYDisplacement() + yPosition), width, height, null);
		};
		
		checkForPlayer(g);
		g.setFont(new Font("Times New Roman",Font.BOLD,15) );
	}
	
	
	
	@Override
	public void tick() {
		
		  ir.x = handler.getXDisplacement() + originalX+25;
	        ir.y = handler.getYDisplacement() + originalY+100;
	        if(handler.getKeyManager().attbut) {
	        	text=!text;
	        }
	        
	}
	
	@Override
	public Rectangle getCollision() {
		return collision;
	}
	
	@Override
	public double getXOffset() {
		return xPosition;
	}
	private void checkForPlayer(Graphics g) {
		

		if(ir.intersects(handler.getEntityManager().getPlayer().getCollision())&& !EP){
			g.drawImage(Images.E,(int) xPosition-140,(int) yPosition-440,32,32,null);
			
			if(handler.getKeyManager().attbut) {
				
				handler.getEntityManager().getPlayer().AcceptQuest=true;
			}
			
			
			
			if(text) {
				
			g.setColor(Color.YELLOW);
	    	g.setFont(new Font("Times New Roman",Font.BOLD,20));
	    	g.drawString("Defeat an Enemy to unlock a skill ",(int)(xPosition-this.getXOffset())+1000,(int)(yPosition-this.getYOffset())+400);
	    	
	    	
	    	g.drawString("You've unclocked a new skill!",(int)(xPosition-this.getXOffset())+1000,(int)(yPosition-this.getYOffset())+425);
	    	
			
			
			}
		}else if(ir.intersects(handler.getEntityManager().getPlayer().getCollision()) && EP){
			HI = true;
		}
		if (!ir.intersects(handler.getEntityManager().getPlayer().getCollision())) {
			HI=false;
		}
	}
	
	
}
