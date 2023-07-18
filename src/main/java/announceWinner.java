public class announceWinner {
        private void announceWinner() {
            if (playerMove == computerMove) {
                System.out.println("It's a draw! Let's play again.");
            } else if ((playerMove == Move.ROCK && computerMove == Move.SCISSORS)
                    || (playerMove == Move.PAPER && computerMove == Move.ROCK)
                    || (playerMove == Move.SCISSORS && computerMove == Move.PAPER)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }


}
