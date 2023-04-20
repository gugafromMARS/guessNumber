public class Main {

    public static void main(String[] args) {


        GuessGame game = new GuessGame();
        game.setPlayers("player1");
        game.setPlayers("player2");
        game.setPlayers("player3");

        game.start();
    }
}
