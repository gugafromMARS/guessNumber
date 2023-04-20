import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private static Scanner scanner = new Scanner(System.in);

    private Player player;
//    private ArrayList players;
    private int number;

    ArrayList<String> players = new ArrayList<>();
    public GuessGame() {
        System.out.println("Run start() for start the game!");
    }

    public void setPlayers(String name) {
        this.player = new Player(name);
        players.add(name);
    }

    public int randomNumber(){
        Random random = new Random();
        return this.number = random.nextInt(1, 6);
    }

    public void start() {
        boolean flag = true;
        int RandomNum = randomNumber();
        while(flag) {
            for(int i = 0; i < players.size(); i++) {
                System.out.println("Time to " + players.get(i) + " guessing the number between 1 and 5");
                int input = Integer.parseInt(scanner.nextLine());
                if(input >= 1 && input <= 20) {
                    boolean isWin = guessNumber(input);
                    if(isWin) {
                        System.out.println(players.get(i) + " is the winner");
                        player.setWins(1);
                        RandomNum = randomNumber();
                        if(players.get(i).getWins() == 3) {   // COMO PLAYERS É ARRAYLIST E NAO A CLASS PLAYER NAO CONSIGO ACEDER AO GETWINS!
                            flag = false;
                            break;
                        }
                    }
                } else {
                    System.out.println("Time to " + players.get(i) + " guessing the number between 1 and 5");
                    input = Integer.parseInt(scanner.nextLine());
                }
            }
        }
    }

    public boolean guessNumber(int number) {
        if(this.number == number) {
            return true;
        } else {
            return false;
        }
    }
}
