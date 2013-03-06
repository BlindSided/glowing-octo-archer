   import java.util.*;

   public class DnDgen{
      public static void main(String[] args){
         int width = 10;
         int height = 10;
         boolean retry = true;
      
      //input dungeon Size(width, height)
         Scanner sc = new Scanner(System.in);
         while(retry){
            try{
               System.out.println("Width: ");
               width = sc.nextInt();
               retry = false;
            }
               catch(InputMismatchException e){
                  System.out.println("Please input a valid integer.");
                  sc.nextLine();
                  retry = true;
               }
         }
         retry = true;
         while(retry){
            try{
               System.out.println("Height: ");
               height = sc.nextInt();
               retry = false;
            }
               catch(InputMismatchException e){
                  System.out.println("Please input a valid integer.");
                  sc.nextLine();
                  retry = true;
               }
         }
			
			//print dungeon size
         System.out.println("The size of the dungeon will be " + width + " tiles by " + height + " tiles.");
			
			
      }
   }