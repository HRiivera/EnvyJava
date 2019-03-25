package Game.Entities.Statics;

import java.awt.Graphics;
import java.awt.Rectangle;
import Main.Handler;
import Resources.Images;

public class Rock extends BaseStaticEntity {
	
	Rectangle collision;
	Rectangle playerDetection;
	int width, height;
	Boolean disappeared = false;
	
	public Rock(Handler handler, int xPosition, int yPosition) {
		super(handler, xPosition, yPosition);
		width = 100;
		height = 100;
		
		this.setXOffset(xPosition);
		this.setYOffset(yPosition);

		
		collision = new Rectangle();
		playerDetection = new Rectangle();
	}
	
	
	@Override
	public void tick(){
		playerDetection = new Rectangle((int)(handler.getXDisplacement() + xPosition-50),(int)(handler.getYDisplacement() + yPosition-50), width+100,height+100);
	}
	
	
	@Override
	public void render(Graphics g) {
		if(playerDetection.intersects(handler.getEntityManager().getPlayer().getCollision()) && handler.getEntityManager().getPlayer().getQuestTurnedIn()) {
			disappeared = true;
		}
		else if(!disappeared){
		g.drawImage(Images.cobblestone, (int)(handler.getXDisplacement() + xPosition),(int)( handler.getYDisplacement() + yPosition), width, height, null);
		}
	}
	
	@Override
	public Rectangle getCollision() {
		return collision;
	}
	

	
	
}
