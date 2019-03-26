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

public class TownArea extends BaseArea {
	
	private Animation mapAnim;
	
    Rectangle exit;
    Rectangle playerRect;
    public static boolean isInTown = false;

    private int imageWidth = 4960, imageHeight = 4800;
    public final static int playerXSpawn = -1500, playerYSpawn = -500
    		;

    private Rectangle background = new Rectangle(4960, 4800);

    public static ArrayList<InWorldWalls> townWalls;

    public TownArea(Handler handler, EntityManager entityManager) {
        super(handler, entityManager);
        name="Town";
        handler.setXInWorldDisplacement(playerXSpawn);
        handler.setYInWorldDisplacement(playerYSpawn);

        playerRect = new Rectangle((int) handler.getWidth() / 2 - 5, (int) (handler.getHeight() / 2) + 300, 70, 70);

        this.entityManager = entityManager;
        
        
       // this.entityManager.AddEntity(new TownEntity(handler,2160,2480,Images.TownEntity));

        
        mapAnim = new Animation(300, Images.Town);
        
        
        townWalls = new ArrayList<>();
        AddWalls();

    }

    public void tick() {
        super.tick();
        
        mapAnim.tick();
        
        for (Walls w : townWalls) {
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

        g2.setColor(Color.green);
        g2.fill(background);

        g.drawImage(mapAnim.getCurrentFrame(), handler.getXInWorldDisplacement(), handler.getYInWorldDisplacement(), null);

        if (GameSetUp.DEBUGMODE) {
            for (Walls w : townWalls) {

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


        townWalls.add(new InWorldWalls(handler, 1590, 0, 10, imageHeight, "Wall"));								// Left Border
        townWalls.add(new InWorldWalls(handler, 1600, 1400, 160, 160, "Wall"));									//Left Upper Tree
        townWalls.add(new InWorldWalls(handler, 1760, 0, 640, 1400, "Wall"));									//Left Upper Row
        townWalls.add(new InWorldWalls(handler, 2560, 0, 480, 1400, "Wall"));									//Right Upper Row
        townWalls.add(new InWorldWalls(handler, 3040, 1400, 160, 160, "Wall"));									//Right Upper Tree
        townWalls.add(new InWorldWalls(handler, 3200, 0, 100, imageHeight, "Wall"));							//Right Border
        townWalls.add(new InWorldWalls(handler, 3040, 2520, 160, 160, "Wall"));									//Right Lower Tree 1
        townWalls.add(new InWorldWalls(handler, 2880, 2680, 160, 160, "Wall"));									//Right Lower Tree 2
        townWalls.add(new InWorldWalls(handler, 0, 2840, imageWidth, 100, "Wall"));								//Lower Border
        townWalls.add(new InWorldWalls(handler, 1600, 2680, 160, 160, "Wall"));	
        
        townWalls.add(new InWorldWalls(handler, 2800, 2280, 80, 80, "Wall"));									//Lower Right Sign
        townWalls.add(new InWorldWalls(handler, 2080, 2600, 80, 80, "Wall"));									//Lower Left Sign
        townWalls.add(new InWorldWalls(handler, 2160, 1880, 80, 80, "Wall"));									//Upper Left Sign
        townWalls.add(new InWorldWalls(handler, 2560, 1880, 80, 80, "Wall"));									//Upper Right Sign
        
        
        townWalls.add(new InWorldWalls(handler, 1760, 1560, 400, 400, "Wall"));									//Upper Left House
        townWalls.add(new InWorldWalls(handler, 2640, 1560, 400, 400, "Wall"));
        townWalls.add(new InWorldWalls(handler, 1840, 2200, 560, 400, "Wall"));
        
        townWalls.add(new InWorldWalls(handler, 2400, 675, 160, 10, "Door Exit"));
        
        townWalls.add(new InWorldWalls(handler, 2160, 2575, 80, 25, "Door Lab"));
        
        townWalls.add(new InWorldWalls(handler, 2000, 1920, 80, 40, "Door Room1"));
        townWalls.add(new InWorldWalls(handler, 544*5, 372*5, 16*5, 20*5, "Door Room3"));
        
        
        
    }

    @Override
    public ArrayList<InWorldWalls> getWalls() {
        return townWalls;
    }
}




