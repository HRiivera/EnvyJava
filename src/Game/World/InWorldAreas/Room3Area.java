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

public class Room3Area extends BaseArea {
	
	
    Rectangle exit;
    Rectangle playerRect;
    public static boolean isInRoom3 = false;

    private int imageWidth = 880, imageHeight = 720;
    public final static int playerXSpawn = 800, playerYSpawn =-30;

    private Rectangle background = new Rectangle(1040, 1040);

    public static ArrayList<InWorldWalls> room3Walls;

    public Room3Area(Handler handler, EntityManager entityManager) {
        super(handler, entityManager);
        name="Room3";
        handler.setXInWorldDisplacement(playerXSpawn);
        handler.setYInWorldDisplacement(playerYSpawn);

        playerRect = new Rectangle((int) handler.getWidth() / 2 - 5, (int) (handler.getHeight() / 2) + 300, 70, 70);

        this.entityManager = entityManager;
        
        room3Walls = new ArrayList<>();
        AddWalls();

    }

    public void tick() {
        super.tick();
        
        for (Walls w : room3Walls) {
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

        g.drawImage(Images.ScaledRoom3, handler.getXInWorldDisplacement(), handler.getYInWorldDisplacement(), null);

        if (GameSetUp.DEBUGMODE) {
            for (Walls w : room3Walls) {

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


        room3Walls.add(new InWorldWalls(handler, -50, 0, 50, imageHeight, "Wall"));			//Left Wall
        room3Walls.add(new InWorldWalls(handler, 0, imageHeight, imageWidth, 50, "Wall"));	//Lower Wall
        room3Walls.add(new InWorldWalls(handler, imageWidth, 0, 50, imageHeight, "Wall"));	//Right Wall
        room3Walls.add(new InWorldWalls(handler, 0, 0, imageWidth, 31*5, "Wall"));			//Upper Wall
        room3Walls.add(new InWorldWalls(handler, 0, 0, 63*5, 47*5, "Wall"));				//Upper Left Wall
        
        room3Walls.add(new InWorldWalls(handler, 105*5, 19*5, 71*5, 29*5, "Wall"));				//Kitchen
        room3Walls.add(new InWorldWalls(handler, 96*5, 61*5, 47*5, 27*5, "Wall"));				//TV
        room3Walls.add(new InWorldWalls(handler, 98*5, 96*5, 28*5, 32*5, "Wall"));				//Table
        
        room3Walls.add(new InWorldWalls(handler, 16*5, imageHeight, 32*5, 10*5, "Door Town"));	//Door Town
        room3Walls.add(new InWorldWalls(handler, 31*5, 29*5, 18*5, 19*5, "Door Room4"));				//Door Room4
        
        
    }

    @Override
    public ArrayList<InWorldWalls> getWalls() {
        return room3Walls;
    }
}


