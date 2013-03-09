   import java.util.*;

   public class Dungeon{
      private int	dungeonWidth;
      private int	dungeonHeight;
      private Tile[][] dungeon;
      private int	roomNumber;
   	
      public Dungeon(int width, int	height){
         dungeonWidth =	width;
         dungeonHeight = height;
         dungeon = new Tile[dungeonWidth][dungeonHeight];
         roomNumber = ((width	* height)/100)*66;
         int lastTileType;
         int nextRoomDir;
         int lastRoomDir =	0;
      	//making	the first room
         int roomWidth = (3+((int)(Math.random()*3)));
         int roomHeight	= (3+((int)(Math.random()*3)));
         int lastRoomWidth	= roomWidth;
         int lastRoomHeight =	roomHeight;
         int totalWidth	= roomWidth;
         int totalHeight =	roomHeight;
         for (int	x = 0;x < roomWidth;x++){
            for (int	y = 0; y	< roomHeight;y++){
               dungeon[x][y] = new Tile((char)1);
               lastTileType =	1;
               roomNumber--;
            }
         }
         nextRoomDir	= (int)(Math.random()*2);
         if	(nextRoomDir == 0){
         	//making	a hallway
            /*dungeon[lastRoomWidth/2][lastRoomHeight] = new Tile((char)1);
            dungeon[lastRoomWidth/2][lastRoomHeight+1] =	new Tile((char)1);
				totalHeight	= totalHeight+2;*/
         	//making	a room
            roomWidth =	(3+((int)(Math.random()*3)));
            roomHeight = (3+((int)(Math.random()*3)));
            totalHeight	= totalHeight+roomHeight;
            for (int	x = 0;x < roomWidth;x++){
               for (int	y = 0; y	< roomHeight;y++){
                  dungeon[Math.max(totalWidth-roomWidth+x, 0+x)][Math.max(totalHeight-roomHeight+y, 0+y)]	= new	Tile((char)1);
                  lastTileType =	1;
                  roomNumber--;
               }
            }
            lastRoomWidth = roomWidth;
            lastRoomHeight	= roomHeight;
            lastRoomDir	= 0;
         }
         if	(nextRoomDir == 1){
         	//making	a hallway
            /*dungeon[lastRoomWidth][lastRoomHeight/2] = new Tile((char)1);
            dungeon[lastRoomWidth+1][lastRoomHeight/2] =	new Tile((char)1);
				totalWidth = totalWidth+2;*/
         	//making	a room
            roomWidth =	(3+((int)(Math.random()*3)));
            roomHeight = (3+((int)(Math.random()*3)));
            totalWidth = totalWidth+roomWidth;
            for (int	x = 0;x < roomWidth;x++){
               for (int	y = 0; y	< roomHeight;y++){
                  dungeon[Math.max(totalWidth-roomWidth+x, 0+x)][Math.max(totalHeight-roomHeight+y, 0+y)]	= new	Tile((char)1);
                  lastTileType =	1;
                  roomNumber--;
               }
            }
            lastRoomWidth = roomWidth;
            lastRoomHeight	= roomHeight;
            lastRoomDir	= 1;
         }
         /*while(roomNumber > 0){
            nextRoomDir	= (int)(Math.random()*2);
            if	(nextRoomDir == 0){
            	//making	a hallway
               if(totalHeight+2 < dungeonHeight){
                  totalHeight	= totalHeight+2;
                  dungeon[lastRoomWidth/2][lastRoomHeight] = new Tile((char)1);
                  dungeon[lastRoomWidth/2][lastRoomHeight+1] =	new Tile((char)1);
               }
               else{
                  break;}
            	//making	a room
               roomWidth =	(3+((int)(Math.random()*3)));
               roomHeight = (3+((int)(Math.random()*3)));
               totalHeight	= totalHeight+roomHeight;
               if(totalHeight	< dungeonHeight){
                  for (int	x = 0;x < roomWidth;x++){
                     for (int	y = 0; y	< roomHeight;y++){
                        dungeon[Math.max(totalWidth-roomWidth+x, 0)][Math.max(totalHeight-roomHeight+y, 0)]	= new	Tile((char)1);
                        lastTileType =	1;
                        roomNumber--;
                     }
                  }
               }
               else{
                  break;}
               lastRoomWidth = roomWidth;
               lastRoomHeight	= roomHeight;
               lastRoomDir	= 0;
            }
            if	(nextRoomDir == 1){
            	//making	a hallway
               if(totalWidth+2 <	dungeonWidth){
                  dungeon[lastRoomWidth][lastRoomHeight/2] = new Tile((char)1);
                  dungeon[lastRoomWidth+1][lastRoomHeight/2] =	new Tile((char)1);
                  totalWidth = totalWidth+2;
               }
               else{
                  break;}
            	//making	a room
               roomWidth =	(3+((int)(Math.random()*3)));
               roomHeight = (3+((int)(Math.random()*3)));
               totalWidth = totalWidth+roomWidth;
               if(totalWidth < dungeonWidth){
                  for (int	x = 0;x < roomWidth;x++){
                     for (int	y = 0; y	< roomHeight;y++){
                        dungeon[Math.max(totalWidth-roomWidth+x, 0)][Math.max(totalHeight-roomHeight+y, 0)]	= new	Tile((char)1);
                        lastTileType =	1;
                        roomNumber--;
                     }
                  }
               }
               else{
                  break;}
               lastRoomWidth = roomWidth;
               lastRoomHeight	= roomHeight;
               lastRoomDir	= 1;
            }
            /*if	(nextRoomDir == 2){
               if	(lastRoomDir == 0){
               	//making	a hallway
                  if(totalHeight+2 < dungeonHeight){
                     totalHeight	= totalHeight+2;
                     dungeon[lastRoomWidth/2][lastRoomHeight] = new Tile((char)1);
                     dungeon[lastRoomWidth/2][lastRoomHeight+1] =	new Tile((char)1);
                  }
                  else{
                     break;}
               	//making	a room
                  roomWidth =	(3+((int)(Math.random()*3)));
                  roomHeight = (3+((int)(Math.random()*3)));
                  totalHeight	= totalHeight+roomHeight;
                  if(totalHeight	< dungeonHeight){
                     for (int	x = 0;x < roomWidth;x++){
                        for (int	y = 0; y	< roomHeight;y++){
                           dungeon[Math.max(totalWidth-roomWidth+x, 0)][Math.max(totalHeight-roomHeight+y, 0)]	= new	Tile((char)1);
                           lastTileType =	1;
                           roomNumber--;
                        }
                     }
                  }
                  else{
                     break;}
                  lastRoomWidth = roomWidth;
                  lastRoomHeight	= roomHeight;
                  lastRoomDir	= 0;
               }               
               if	(lastRoomDir == 1){
               	//making	a hallway
                  if(totalWidth+2 <	dungeonWidth){
                     dungeon[lastRoomWidth][lastRoomHeight/2] = new Tile((char)1);
                     dungeon[lastRoomWidth+1][lastRoomHeight/2] =	new Tile((char)1);
                     totalWidth = totalWidth+2;
                  }
                  else{
                     break;}
               	//making	a room
                  roomWidth =	(3+((int)(Math.random()*3)));
                  roomHeight = (3+((int)(Math.random()*3)));
                  totalWidth = totalWidth+roomWidth;
                  if(totalWidth < dungeonWidth){
                     for (int	x = 0;x < roomWidth;x++){
                        for (int	y = 0; y	< roomHeight;y++){
                           dungeon[Math.max(totalWidth-roomWidth+x, 0)][Math.max(totalHeight-roomHeight+y, 0)]	= new	Tile((char)1);
                           lastTileType =	1;
                           roomNumber--;
                        }
                     }
                  }
                  else{
                     break;}
                  lastRoomWidth = roomWidth;
                  lastRoomHeight	= roomHeight;
                  lastRoomDir	= 1;
               }
            }*/
         //}
      }
   	
      public String getDungeonTileType(int x, int y){
      	//System.out.println(x);
      	//System.out.println(y);
         if	(dungeon[x][y]	==	null){
            return "	";
         }
         else {
         	//System.out.println(dungeon[x][y].getTileType());
            return "" +	((int)dungeon[x][y].getTileType());
         }
      }
   	
      public boolean	getDungeonTileOccupied(int	x,	int y){
         return dungeon[x][y].getIsOccupied();
      }
   }