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
			//making the first room
			int roomWidth = (3+((int)Math.random()*3));
			int roomHeight = (3+((int)Math.random()*3));
			int lastRoomWidth = roomWidth;
			int lastRoomHeight = roomHeight;
			int totalWidth = roomWidth;
			int totalHeight = roomHeight;
      	for (int x = 0;x < roomWidth;x++){
				for (int y = 0; x < roomHeight;y++){
					dungeon[x][y] = new Tile(1);
					lastTileType = 1;
					roomNumber--;
				}
			}
			nextRoomDir = (int)Math.random()*2;
			if (nextRoomDir == 0){
				//making a hallway
				dungeon[lastRoomWidth/2][lastRoomHeight+1] = new Tile(1);
				dungeon[lastRoomWidth/2][lastRoomHeight+2] = new Tile(1);
				totalHeight = totalHeight+2;
				//making a room
				roomWidth = (3+((int)Math.random()*3));
				roomHeight = (3+((int)Math.random()*3));
				totalWidth = Math.max(totalWidth, roomWidth);
				totalHeight = totalHeight+roomHeight;
    		  	for (int x = 0;x < roomWidth;x++){
					for (int y = 0; x < roomHeight;y++){
						dungeon[totalWidth-roomWidth+x][totalHeight-roomHeight+y] = new Tile(1);
						lastTileType = 1;
						roomNumber--;
					}
				}
				lastRoomWidth = roomWidth;
				lastRoomHeight = roomHeight;
				lastRoomDir = 0;
			}
			if (nextRoomDir == 1){
				//making a hallway
				dungeon[roomWidth+1][roomHeight/2] = new Tile(1);
				dungeon[roomWidth+2][roomHeight/2] = new Tile(1);
				totalWidth = totalWidth+2;
				//making a room
				roomWidth = (3+((int)Math.random()*3));
				roomHeight = (3+((int)Math.random()*3));
				totalWidth = totalWidth+roomWidth;
				totalHeight = Math.max(totalHeight, roomHeight);
    		  	for (int x = 0;x < roomWidth;x++){
					for (int y = 0; x < roomHeight;y++){
						dungeon[totalWidth-roomWidth+x][totalHeight-roomHeight+y] = new Tile(1);
						lastTileType = 1;
						roomNumber--;
					}
				}
				lastRoomWidth = roomWidth;
				lastRoomHeight = roomHeight;
				lastRoomDir = 1;
			}
      }
   }