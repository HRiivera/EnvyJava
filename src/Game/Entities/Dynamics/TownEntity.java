package Game.Entities.Dynamics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import Game.Entities.Statics.BaseStaticEntity;
import Game.World.InWorldAreas.LabArea;
import Main.Handler;
import Resources.Images;
import javafx.scene.input.KeyCode;

public class TownEntity extends BaseStaticEntity {

	Rectangle collision;
	int width, height;
	private Rectangle ir = new Rectangle();
	private int originalX;
	private int originalY;
	public Boolean text=false;
	int counter=0;
	int showtext=0;
	int showtext2=0;
	int showtext3=0;
	String textdialogue= "Defeat an Enemy to unlock a skill ";
	String textdialogue2="You've unclocked a new  Freeze skill,";
	String textdialogue3=" and a new cave area to explore!";

	private Boolean pressed = false;


	public TownEntity(Handler handler, int xPosition, int yPosition, BufferedImage townEntity) {
		super(handler, xPosition, yPosition);
		width = 100;
		height = 200;

		this.setXOffset(xPosition);
		this.setYOffset(yPosition);

		ir.x=xPosition;
		ir.y=yPosition;
		ir.width = 100;
		ir.height = 100;

		originalX=xPosition;
		originalY=yPosition;






		collision = new Rectangle();
	}





	@Override
	public void render(Graphics g) {
		if(LabArea.isInLab) {
			//g.drawRect(ir.x, ir.y, ir.width, ir.height);


			g.drawImage(Images.TownEntity, (int)(handler.getXInWorldDisplacement() + xPosition),(int)( handler.getYInWorldDisplacement() + yPosition), width, height, null);
			collision = new Rectangle((int)(handler.getXInWorldDisplacement() + xPosition + 35), (int)(handler.getYInWorldDisplacement() + yPosition + 50), width/4, height/2);
			checkForPlayer(g);
		}
	}


	@Override
	public void tick() {
		
		
		if(text==true) {
			
			counter++;
			if(counter>2) {
			
		 if(showtext<=textdialogue.length()-1) {
				
				showtext++;
				
			}if(showtext2<=textdialogue2.length()-1) {
				showtext2++;
				
			}else if(showtext3<=textdialogue3.length()-1) {
				showtext3++;
			}
			counter=0;
			} 
			
			
		}
		
		else {
			counter=0;
		}
		

		ir.x = handler.getXInWorldDisplacement() + originalX+25;
		ir.y = handler.getYInWorldDisplacement() + originalY+200;
		if(LabArea.isInLab) {
			if(releasedE() && ir.intersects(handler.getEntityManager().getPlayer().getCollision())) {
				text=!text;
			}
			else if(!ir.intersects(handler.getEntityManager().getPlayer().getCollision())) {
				text=false;
			}
		}

	}

	public Boolean releasedE() {
		if(handler.getKeyManager().attbut) {
			pressed = true;
		}
		else if(handler.getKeyManager().attbut == false && pressed) {
			pressed = false;
			System.out.println("Pressed");
			return true;
		}
		return false;

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


		if(ir.intersects(handler.getEntityManager().getPlayer().getCollision())){

			g.drawImage(Images.E,(int) ir.x+10,(int) ir.y-230,32,32,null);

			if(text) {

				g.setColor(Color.BLACK);
				g.setFont(new Font("Times New Roman",Font.BOLD,20));

				if(handler.getEntityManager().getPlayer().getQuestComplete()) {
					
					g.drawImage(Images.textbox, handler.getWidth()/2-250, handler.getHeight()-194, 500,194,null);
					g.drawImage(Images.professorhead, handler.getWidth()/2-250, handler.getHeight()-150, 179,106,null);
					g.drawString(textdialogue2.substring(0,showtext2),(int)(xPosition-this.getXOffset())+865,(int)(yPosition-this.getYOffset())+975);
					g.drawString(textdialogue3.substring(0,showtext3),(int)(xPosition-this.getXOffset())+875,(int)(yPosition-this.getYOffset())+1000);
					handler.getEntityManager().getPlayer().setQuestTurnedIn(true);
					handler.getEntityManager().getPlayer().setSkill("Freeze");
					System.out.println("Quest Turned In");			
				}else {
					g.drawImage(Images.textbox, handler.getWidth()/2-250, handler.getHeight()-194, 500,194,null);
					g.drawImage(Images.professorhead, handler.getWidth()/2-250, handler.getHeight()-150, 179,106,null);
					g.drawString(textdialogue.substring(0,showtext),(int)(xPosition-this.getXOffset())+875,(int)(yPosition-this.getYOffset())+975);
					handler.getEntityManager().getPlayer().setAcceptQuest(true);
					System.out.println("Accepted Quest");
				}

			}
		}
	}


}
