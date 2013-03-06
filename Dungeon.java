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
         for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
               dungeon[x][y] = new Tile();
            }
         }
         dungeon[0][0].setTileType(1);
         roomNumber--;
      	for (int i = 0;i < Math.random()*5;i++){
				//code
			}
      }
   }