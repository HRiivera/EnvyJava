package Game.World.InWorldAreas;

import Main.GameSetUp;
import Main.Handler;
import Resources.Images;
import Resources.Animation;
import java.awt.*;
import java.util.ArrayList;

import Game.Entities.EntityManager;
import Game.Entities.Dynamics.TownEntity;
import Game.World.Walls;

public class Room1Area extends BaseArea {
	
	
    Rectangle exit;
    Rectangle playerRect;
    public static boolean isInRoom1 = false;

    private int imageWidth = 880, imageHeight = 720;
    public final static int playerXSpawn = 250, playerYSpawn =-30;

    private Rectangle background = new Rectangle(1040, 1040);

    public static ArrayList<InWorldWalls> room1Walls;

    public Room1Area(Handler handler, EntityManager entityManager) {
        super(handler, entityManager);
        name="Room1";
        handler.setXInWorldDisplacement(playerXSpawn);
        handler.setYInWorldDisplacement(playerYSpawn);

        playerRect = new Rectangle((int) handler.getWidth() / 2 - 5, (int) (handler.getHeight() / 2) + 300, 70, 70);

        this.entityManager = entityManager;
        
        room1Walls = new ArrayList<>();
        AddWalls();

    }

    public void tick() {
        super.tick();
        
        for (Walls w : room1Walls) {
            w.tick();
            w.getUpWall();
            
        }
        if(!GameSetUp.LOADING) {
            entityManager.tick();
        }
        
    }

    @Override
    public void render(Graphics g) {
        super.render(g);


        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.fill(background);

        g.drawImage(Images.ScaledRoom1, handler.getXInWorldDisplacement(), handler.getYInWorldDisplacement(), null);

        if (GameSetUp.DEBUGMODE) {
            for (Walls w : room1Walls) {

                if (w.getType().equals("Wall"))
                    g2.setColor(Color.black);
                else
                    g2.setColor(Color.PINK);

                w.render(g2);
               g2.drawRect( w.getUpWall().x,  w.getUpWall().y,  w.getUpWall().width,  w.getUpWall().height);
               g2.drawRect( w.getDownWall().x,  w.getDownWall().y,  w.getDownWall().width,  w.getDownWall().height);
               g2.drawRect( w.getLeftWall().x,  w.getLeftWall().y,  w.getLeftWall().width,  w.getLeftWall().height);
               g2.drawRect( w.getRightWall().x,  w.getRightWall().y,  w.getRightWall().width,  w.getRightWall().height);
            }
        }


        entityManager.render(g);

    }

    private void AddWalls() {


        room1Walls.add(new InWorldWalls(handler, 0, 0, 355, 240, "Wall")); 		 			//Upper Left Wall
        room1Walls.add(new InWorldWalls(handler, -50, 0, 50, imageHeight, "Wall")); 		 //Left Wall
        room1Walls.add(new InWorldWalls(handler, 0, imageHeight, 635, 50, "Wall")); 		 //Lower Right Wall
        room1Walls.add(new InWorldWalls(handler, 800, imageHeight, 80, 50, "Wall")); 		 //Lower Right Wall
        room1Walls.add(new InWorldWalls(handler, 720, 0, 160, 235, "Wall")); 		 		//Upper Right Wall
        room1Walls.add(new InWorldWalls(handler, 560, 0, 75, 235, "Wall")); 					 //Upper Right Wall
        room1Walls.add(new InWorldWalls(handler, 360, 0, 200, 160, "Wall")); 						 //Upper Wall
        room1Walls.add(new InWorldWalls(handler, imageWidth, 0, 50, imageHeight, "Wall")); 				 //Right Wall
        
        
        room1Walls.add(new InWorldWalls(handler, 160, 310, 240, 130, "Wall")); 		 				//TV	
        room1Walls.add(new InWorldWalls(handler, 250, 480, 140, 160, "Wall")); 						 //Lower Right Wall
        
        room1Walls.add(new InWorldWalls(handler, 128*5, imageHeight, 160, 50, "Door Town")); 		 //Door Town
        room1Walls.add(new InWorldWalls(handler, 127*5, 29*5, 18*5, 19*5, "Door Room2")); 						 //Door Room2
        
    }

    @Override
    public ArrayList<InWorldWalls> getWalls() {
        return room1Walls;
    }
}


