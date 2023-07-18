public class RockPaperScissorsGame {

import move.Move;

        import java.util.Scanner;



    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Please enter Rock, Paper or Scissors:");
        Scanner = new Scanner(System.in);
        String rps = scanner .next();

        public void play() {
            do {
                computerMove = getRandomMove();
                playerMove = getPlayerMove();
                System.out.println("Computer chose: " + computerMove);
                System.out.println("You chose: " + playerMove);
                announceWinner();
            } while (playerMove == computerMove);
        }


    }




}

