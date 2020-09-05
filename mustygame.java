import java.util.Scanner;

public class mustygame{
public static void main (String [] args){  
    Scanner player1 = new Scanner (System.in);
    Scanner player2 = new Scanner (System.in);
        System.out.println ("player1 type a number");
       int player1input = player1.nextInt();
        System.out.println ("player2 type a number");
      int  player2input = player2.nextInt();

      if  (player2input == player1input){
          System.out.println(" you win" );
      }
      else if (player2input < player1input){
          System.out.println( "you failed"  );
          System.out.println( "go higher - player 1 typed:"+ player1input );
      }
      else  {
          System.out.println( "you failed" );
          System.out.println("go lower - player 1 typed:" + player1input);
          }
}
}
