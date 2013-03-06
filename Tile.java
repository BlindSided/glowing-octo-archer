   public class Tile{
      private int tileType;
      private boolean isOccupied;
   	
      public Tile(){
         tileType=0;
         isOccupied=false;
      }
   	
   	public int getTileType(){
			return tileType;
		}
		public void setTileType(int type){
			this.tileType=type;   
		}
   	public boolean getIsOccupied(){
			return isOccupied;
		}
		public void setIsOccupied(boolean occupied){
			this.isOccupied=occupied;
		}
   }