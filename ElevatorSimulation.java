import java.util.Scanner;

/**
   This program simulates an elevator panel that skips the 13th floor.
*/
public class ElevatorSimulation
{
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Floor: ");
      int floor = in.nextInt();

      // Adjust floor if necessary

      int actualFloor = floor;
      if (floor > 13)
      {
         actualFloor--;  // = floor - 1;
      }
      

      System.out.println("The elevator will travel to the actual floor " + actualFloor);
   }
}
