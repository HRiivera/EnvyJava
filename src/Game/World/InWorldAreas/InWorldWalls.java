package Game.World.InWorldAreas;

import Game.World.Walls;
import Main.Handler;

public class InWorldWalls extends Walls {
	
	
	public InWorldWalls(Handler handler, int x, int y, int width, int height, String wallType) {
		super(handler, x, y, width, height, wallType);

		this.originalX = x;
		this.originalY = y;
		this.handler = handler;
		this.wallType = wallType;
		upWall.height = 20;
		downWall.height = 20;
		leftWall.width = 20;
		rightWall.width = 20;
	}

	@Override
	public void tick() {
		this.x = handler.getXInWorldDisplacement() + originalX;
		this.y = handler.getYInWorldDisplacement() + originalY;
		
		upWall.x = originalX + handler.getXInWorldDisplacement();
        upWall.y = originalY-20 + handler.getYInWorldDisplacement();
        
        downWall.x = originalX + handler.getXInWorldDisplacement();
        downWall.y = originalY+height + handler.getYInWorldDisplacement();
        
        leftWall.x = originalX-20 + handler.getXInWorldDisplacement();
        leftWall.y = originalY + handler.getYInWorldDisplacement();
        
        rightWall.x = originalX+width + handler.getXInWorldDisplacement();
        rightWall.y = originalY + handler.getYInWorldDisplacement();
	}
}
