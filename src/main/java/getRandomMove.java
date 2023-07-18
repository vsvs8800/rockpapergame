public class getRandomMove {
    private Move getRandomMove() {
        int randomNumber = (int) (Math.random() * 3); // 0: ROCK, 1: PAPER, 2: SCISSORS

        switch (randomNumber) {
            case 0:
                return Move.ROCK;
            case 1:
                return Move.PAPER;
            case 2:
                return Move.SCISSORS;
            default:
                return Move.ROCK; // This should never happen
        }
    }
}
}
