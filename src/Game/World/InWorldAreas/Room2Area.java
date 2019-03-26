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

public class Room2Area extends BaseArea {
	
	
    Rectangle exit;
    Rectangle playerRect;
    public static boolean isInRoom2 = false;

    private int imageWidth = 720, imageHeight = 640;
    public final static int playerXSpawn = 400, playerYSpawn =400;

    private Rectangle background = new Rectangle(1040, 1040);

    public static ArrayList<InWorldWalls> room2Walls;

    public Room2Area(Handler handler, EntityManager entityManager) {
        super(handler, entityManager);
        name="Room2";
        handler.setXInWorldDisplacement(playerXSpawn);
        handler.setYInWorldDisplacement(playerYSpawn);

        playerRect = new Rectangle((int) handler.getWidth() / 2 - 5, (int) (handler.getHeight() / 2) + 300, 70, 70);

        this.entityManager = entityManager;
        
        room2Walls = new ArrayList<>();
        AddWalls();

    }

    public void tick() {
        super.tick();
        
        for (Walls w : room2Walls) {
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

        g.drawImage(Images.ScaledRoom2, handler.getXInWorldDisplacement(), handler.getYInWorldDisplacement(), null);

        if (GameSetUp.DEBUGMODE) {
            for (Walls w : room2Walls) {

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


        room2Walls.add(new InWorldWalls(handler, -50, 0, 50, imageHeight, "Wall"));			//Left Wall
        room2Walls.add(new InWorldWalls(handler, 0, 0, imageWidth, 32*5, "Wall"));			//Upper Wall
        room2Walls.add(new InWorldWalls(handler, imageWidth, 0, 50, imageHeight, "Wall"));	//Right Wall
        room2Walls.add(new InWorldWalls(handler, 0, imageHeight, imageWidth, 50, "Wall"));	//Lower Wall
        
        room2Walls.add(new InWorldWalls(handler, 51*5, 0, 29*5, 39*5, "Wall"));				//Desk
        room2Walls.add(new InWorldWalls(handler, 0, 0, 355, 240, "Wall"));					//TV
        room2Walls.add(new InWorldWalls(handler, 12*5, 62*5, 24*5, 31*5, "Wall"));			//Bed
        
        room2Walls.add(new InWorldWalls(handler, 111*5, 13*5, 18*5, 19*5, "Door Room1"));	//Door Room1		
    }

    @Override
    public ArrayList<InWorldWalls> getWalls() {
        return room2Walls;
    }
}


