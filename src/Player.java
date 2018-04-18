import java.util.List;

public class Player implements Runnable {
    private String name;
    private Game   game;

    public Player(String name) {
        this.name = name;
    }

    private synchronized /*boolean*/ void createSubmitWord() throws InterruptedException {   // EXTRAGE LITERA SI FORMEAZA CUVANT, PE CARE
        List extracted = game.getBag().extractLetters(1);                          // IL PUNE PE TABLA
        if (extracted.isEmpty()) {
            System.exit(0);
            //return false;
        }
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            word.append(extracted.get(0));
        }
        game.getBoard().addWord(this, word.toString());
        //Thread.sleep(300);
        notify();
        //return true;
    }
    //implement the run() method, that will repeatedly create and submit words
    //implement the toString() method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", game=" + game +
                '}';
    }

    @Override
    public void run() {
        try {
            this.createSubmitWord();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
