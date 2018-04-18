import java.util.Vector;

public class Board {
    Vector<String> words = new Vector<>();

    public Board() {}

    public Board(Vector<String> words) {
        this.words = words;
    }

    public synchronized void addWord(Player player, String word) {
        this.words.add(word);

        System.out.println("Player " + player.getName() + " submitted the word " + word);

    }

    public Vector<String> getWords() {
        return words;
    }

    public void setWords(Vector<String> words) {
        this.words = words;
    }
}
