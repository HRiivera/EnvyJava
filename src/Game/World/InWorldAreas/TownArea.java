package Game.World.InWorldAreas;

import Main.GameSetUp;
import Main.Handler;
import Resources.Images;
import java.awt.*;
import java.util.ArrayList;

import Game.Entities.EntityManager;
import Game.Entities.Dynamics.TownEntity;
import Game.World.Walls;

public class TownArea extends BaseArea {

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
        
        
        this.entityManager.AddEntity(new TownEntity(handler,1200,1000,Images.TownEntity));

        

        
        
        townWalls = new ArrayList<>();
        AddWalls();

    }

    public void tick() {
        super.tick();

        for (Walls w : townWalls) {
            w.tick();
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

        g.drawImage(Images.ScaledTown, handler.getXInWorldDisplacement(), handler.getYInWorldDisplacement(), null);

        if (GameSetUp.DEBUGMODE) {
            for (Walls w : townWalls) {

                if (w.getType().equals("Wall"))
                    g2.setColor(Color.black);
                else
                    g2.setColor(Color.PINK);

                w.render(g2);
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
        townWalls.add(new InWorldWalls(handler, 3200, 0, 10, imageHeight, "Wall"));								//Right Border
        townWalls.add(new InWorldWalls(handler, 3040, 2520, 160, 160, "Wall"));									//Right Lower Tree 1
        townWalls.add(new InWorldWalls(handler, 2880, 2680, 160, 160, "Wall"));									//Right Lower Tree 2
        townWalls.add(new InWorldWalls(handler, 0, 2840, imageWidth, 10, "Wall"));								//Lower Border
        townWalls.add(new InWorldWalls(handler, 1600, 2680, 160, 160, "Wall"));	
        
        townWalls.add(new InWorldWalls(handler, 2800, 2280, 80, 80, "Wall"));									//Lower Right Sign
        townWalls.add(new InWorldWalls(handler, 2080, 2600, 80, 80, "Wall"));									//Lower Left Sign
        townWalls.add(new InWorldWalls(handler, 2160, 1880, 80, 80, "Wall"));									//Upper Left Sign
        townWalls.add(new InWorldWalls(handler, 2560, 1880, 80, 80, "Wall"));									//Upper Right Sign
        
        
        townWalls.add(new InWorldWalls(handler, 1760, 1560, 400, 400, "Wall"));									//Upper Left House
        townWalls.add(new InWorldWalls(handler, 2640, 1560, 400, 400, "Wall"));
        townWalls.add(new InWorldWalls(handler, 1840, 2200, 560, 400, "Wall"));
        
        townWalls.add(new InWorldWalls(handler, 2400, 675, 160, 10, "Door S"));
        
        
        
        
    }

    @Override
    public ArrayList<InWorldWalls> getWalls() {
        return townWalls;
    }
}




