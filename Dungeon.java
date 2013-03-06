   public class Dungeon{
   	int dungeonWidth;
		int dungeonHeight;
		Tile[][] dungeonLayout;
		
		public Dungeon(int width, int height){
			dungeonWidth = width;
			dungeonHeight = height;
			dungeonLayout = new Tile[dungeonWidth][dungeonHeight];
			for (int x = 0; x < width; x++){
				for (int y = 0; y < height; y++){
					dungeonLayout[x][y] = new Tile();
				}
			}
		}
   }