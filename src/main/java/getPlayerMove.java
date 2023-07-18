public class getPlayerMove {
    private Move getPlayerMove() {
        System.out.print("Enter your move (ROCK, PAPER, or SCISSORS): ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            return Move.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid move. Please enter ROCK, PAPER, or SCISSORS.");
            return getPlayerMove(); // Recursively ask for the move again
        }

}

