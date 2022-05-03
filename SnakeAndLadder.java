import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadder {
    //To roll a die
     public int dieroll()
     {
         Scanner a = new Scanner(System.in);
         System.out.println("\nPress Y to begin by rolling die:");
         String b = a.nextLine();
         Random die = new Random();
         int i = die.nextInt(6) + 1;
         return i;
     }
     //To get player position
     public int playerposition(){
         int player1=0;
         SnakeAndLadder SL = new SnakeAndLadder();
         int die=SL.dieroll();
         System.out.println("\t\tThe Die value= " + die );
         System.out.println("\n\t\tChecking your status condition:");
         Random options= new Random();
         int i =options.nextInt(3);
         switch (i){
             case 0:
                 System.out.println("\t\tNo play : The player stays in same position");
                 player1=0;
                 break;
             case 1:
                 System.out.println("\t\tHurray!! you got Ladder : Move ahead");
                 player1= die;
                 break;
             case 2:
                 System.out.println("\t\tOops you hit a Snake : Move back");
                 player1= player1-die;
                 break;
         }
         return player1;
     }
     //To make player movement (*note:player movement above 100 restricted by command line 50)
     public int positionmovement(){
         SnakeAndLadder pos = new SnakeAndLadder();
         int position=0;
         for(int i=0;position<=100;i++){
             int x=pos.playerposition();
             position=position+x;
             if(position<=0){
                 position=0;
                 System.out.println("\t\tYou are in the starting position roll again");
             }else if(position>100){
                 position=position-x;
                 System.out.println("\t\tSorry!! Roll again to get exact value to reach finishing point");
             }else
             System.out.println("\t\tYour current position ="+ position);
         }
             return position;
     }
     public static void main(String[] args)
     {
         SnakeAndLadder game = new SnakeAndLadder();
         System.out.println("\t\t*****Welcome To Snake And Ladder*****");
         System.out.println("\tThe Game begins with player at 0 position...");
         int win=game.positionmovement();
         if(win==100) {
             System.out.println("You Won");
         }
     }
}
