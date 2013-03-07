   import java.util.*;

   public class Dungeon{
      private int dungeonWidth;
      private int dungeonHeight;
      private Tile[][] dungeon;
      private int roomNumber;
   	
      public Dungeon(int width, int height){
         dungeonWidth = width;
         dungeonHeight = height;
         dungeon = new Tile[dungeonWidth][dungeonHeight];
         roomNumber = ((width * height)/100)*66;
         int lastTileType;
			int nextRoomDir;
			int lastRoomDir;
			int roomWidth = (3+((int)Math.random()*3));
			int roomHeight = (3+((int)Math.random()*3));
      	for (int x = 0;x < roomWidth;x++){
				for (int y = 0; x < roomHeight;y++){
					dungeon[x][y] = new Tile(1);
					lastTileType = 1;
				}
			}
			roomNumber--;
			nextRoomDir = (int)Math.random()*2;
			if (nextRoomDir == 0){
				dungeon[roomWidth/2][roomHeight+1] = new Tile(1);
				dungeon[roomWidth/2][roomHeight+2] = new Tile(1);
				lastRoomDir = 0;
			}
			if (nextRoomDir == 1){
				dungeon[roomWidth+1][roomHeight/2] = new Tile(1);
				dungeon[roomWidth+2][roomHeight/2] = new Tile(1);
				lastRoomDir = 1;
			}
      }
   }