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
			int roomWidth = (int)(3+(Math.random()*2));
			int roomHeight = (int)(3+(Math.random()*2));
      	for (int x = 0;x < roomWidth;x++){
				for (int y = 0; x < roomHeight;y++){
					dungeon[x][y].setTileType(1);
					lastTileType = 1;
				}
			}
			roomNumber--;
      }
   }