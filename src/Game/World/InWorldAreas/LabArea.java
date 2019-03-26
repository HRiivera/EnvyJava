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

public class LabArea extends BaseArea {
	
	
    Rectangle exit;
    Rectangle playerRect;
    public static boolean isInLab = false;

    private int imageWidth = 1040, imageHeight = 1040;
    public final static int playerXSpawn = 450, playerYSpawn =-300;

    private Rectangle background = new Rectangle(1040, 1040);

    public static ArrayList<InWorldWalls> labWalls;

    public LabArea(Handler handler, EntityManager entityManager) {
        super(handler, entityManager);
        name="Lab";
        handler.setXInWorldDisplacement(playerXSpawn);
        handler.setYInWorldDisplacement(playerYSpawn);

        playerRect = new Rectangle((int) handler.getWidth() / 2 - 5, (int) (handler.getHeight() / 2) + 300, 70, 70);

        this.entityManager = entityManager;
        
        
        this.entityManager.AddEntity(new TownEntity(handler,500,100,Images.TownEntity));

        
        
        
        labWalls = new ArrayList<>();
        AddWalls();

    }

    public void tick() {
        super.tick();
        
        for (Walls w : labWalls) {
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

        g.drawImage(Images.ScaledLab, handler.getXInWorldDisplacement(), handler.getYInWorldDisplacement(), null);

        if (GameSetUp.DEBUGMODE) {
            for (Walls w : labWalls) {

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


        labWalls.add(new InWorldWalls(handler, 0, 0, 315, imageHeight, "Wall"));  	 //Left Wall
        labWalls.add(new InWorldWalls(handler, 0, 0, imageWidth, 195, "Wall")); 	 //Upper Wall
        labWalls.add(new InWorldWalls(handler, 720, 0, 320, 395, "Wall")); 			 //Upper Right Wall
        labWalls.add(new InWorldWalls(handler, 800, 395, 245, 645, "Wall")); 		 //Lower Right Wall
        labWalls.add(new InWorldWalls(handler, 0, imageHeight, 475, 50, "Wall")); 		 //Lower Right Wall
        labWalls.add(new InWorldWalls(handler, 635, imageHeight, 400, 50, "Wall")); 		 //Lower Right Wall
        
        labWalls.add(new InWorldWalls(handler, 485, imageHeight, 160, 50, "Door Town")); 		 //Lower Right Wall
        
    }

    @Override
    public ArrayList<InWorldWalls> getWalls() {
        return labWalls;
    }
}


