import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadder {
     //To roll a die 
     public int dieroll()
     {
         Scanner a = new Scanner(System.in);
         System.out.println("Press Y to begin by rolling die:");
         String b = a.nextLine();
         Random die = new Random();
         int i = die.nextInt(6) + 1;
         return i;
     }
     public static void main(String[] args)
     {
         SnakeAndLadder SL = new SnakeAndLadder();
         System.out.println("*****Welcome To Snake And Ladder*****");
         System.out.println("The Game begins with player at 0 position");
         System.out.println("The Die value= " + SL.dieroll());
     }
}
