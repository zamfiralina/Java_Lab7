import java.util.ArrayList;
import java.util.List;

public class Game {
    private Bag   bag;
    private Board board;
    //private Dictionary dictionary;

    private final List<Player> players = new ArrayList<>();
    private boolean available = false;
    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    //Create getters and setters
    //Create the method that will start the game: start one thread for each player


    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void start() throws InterruptedException {

        while (bag.getLetters().size() > 0) {

            for (Player player : players) {

                Thread thread = new Thread(player);
                thread.start();

                synchronized (player) {
                    player.wait();
                }

            }

        }

    }
}
