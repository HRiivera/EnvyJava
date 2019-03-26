package Game.GameStates;

import Game.Entities.EntityManager;
import Game.World.InWorldAreas.BaseArea;
import Game.World.InWorldAreas.CaveArea;
import Game.World.InWorldAreas.LabArea;
import Game.World.InWorldAreas.TownArea;
import Game.World.InWorldAreas.Room1Area;
import Game.World.InWorldAreas.Room2Area;
import Game.World.InWorldAreas.Room3Area;
import Game.World.InWorldAreas.Room4Area;
import Main.GameSetUp;
import Main.Handler;
import java.awt.*;
import java.awt.event.KeyEvent;

import Resources.Images;

public class InWorldState extends State{


    public EntityManager entityManager;	// To manager the entities within the InWorld
    public static BaseArea currentArea;
    public static BaseArea caveArea;
    public static BaseArea townArea;
    public static BaseArea SArea;
    public static BaseArea labArea;
    public static BaseArea room1Area;
    public static BaseArea room2Area;
    public static BaseArea room3Area;
    public static BaseArea room4Area;

    public InWorldState(Handler handler) {
        super(handler);
        entityManager = new EntityManager(handler, handler.getEntityManager().getPlayer());

        caveArea = new CaveArea(handler, entityManager);
        townArea = new TownArea(handler, entityManager);
        labArea = new LabArea(handler, entityManager);
        room1Area = new Room1Area(handler, entityManager);
        room2Area = new Room2Area(handler, entityManager);
        room3Area = new Room3Area(handler, entityManager);
        room4Area = new Room4Area(handler, entityManager);
        SArea = this.handler.getKeyManager().new Area(handler, entityManager);

    }

    @Override
    public void tick() {
        if(GameSetUp.LOADING){
            if(GameSetUp.loadCounter>=90){
                GameSetUp.loadCounter=0;
                GameSetUp.LOADING=false;
                return;
            }
            if (currentArea != null) {
                currentArea.tick();
            }
            GameSetUp.loadCounter++;
        }else {
            if (handler.getKeyManager().keyJustPressed(KeyEvent.VK_ESCAPE)) {
                handler.getGame().pauseState.lastState = State.getState();
                GameSetUp.SWITCHING=true;
                State.setState(handler.getGame().pauseState);
            }else {
                if (currentArea != null) {
                    currentArea.tick();
                }
            }
        }

    }

    @Override
    public void render(Graphics g) {

        if(!GameSetUp.LOADING) {
            Graphics2D g2 = (Graphics2D) g;
            if (currentArea != null) {
                currentArea.render(g);
            }
        }else{
            g.drawImage(Images.Loading,0,0,handler.getWidth(),handler.getHeight(),null);
        }

    }

    public State setArea(BaseArea area){
        currentArea = area;
        return this;
    }

}