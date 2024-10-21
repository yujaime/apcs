import java.util.Scanner;

public class RockPaperScissors {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
      System.out.print("Enter Rock, Paper, or Scissors (R, P, S): ");
      char c = sc.next().charAt(0);
      int Com = (int)(Math.random() * 3);
      System.out.println("You chose: " + c);
      switch(c) {
          case 'R':
              if (Com == 0){
                  System.out.println("The computer chose: Rock");
                  System.out.println("Tie!");
              } else if (Com == 2){
                  System.out.println("The computer chose: Scissors");
                  System.out.println("You Win!");
              } else if (Com == 1){
                  System.out.println("The computer chose: Paper");
                  System.out.println("You lose. :(");
              }
              break;
          case 'S':
            if (Com == 0){
                System.out.println("The computer chose: Rock");
                System.out.println("You lose. :(");
              } else if (Com == 2){
                  System.out.println("The computer chose: Scissors");
                  System.out.println("Tie!");
              } else if (Com == 1){
                  System.out.println("The computer chose: Paper");
                  System.out.println("You Win!");
              }
              break;
          case 'P':
            if (Com == 0){
                  System.out.println("The computer chose: Rock");
                  System.out.println("You Win!");
              } else if (Com == 2){
                  System.out.println("The computer chose: Scissors");
                  System.out.println("You lose. :(");
              } else if (Com == 1){
                  System.out.println("The computer chose: Paper");
                  System.out.println("Tie!");
              }
              break;
      }
    }
}
