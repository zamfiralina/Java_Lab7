import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bag {
    private final Queue<Character> letters = new LinkedList<>();

    public Bag() { // Add all the letters from 'a' to 'z' in the bag.

        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');
        letters.add('f');
        letters.add('g');
        letters.add('h');
        letters.add('i');
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('m');
        letters.add('n');
        letters.add('o');
        letters.add('p');
        letters.add('q');
        letters.add('r');
        letters.add('s');
        letters.add('t');
        letters.add('u');
        letters.add('v');
        letters.add('w');
        letters.add('x');
        letters.add('y');
        letters.add('z');

    }
        public synchronized List<Character> extractLetters(int howMany) {
            // Replace the dots so that the bag is thread-safe
            List<Character> extracted = new ArrayList<>();
            for (int i = 0; i < howMany; i++) {
                if (letters.isEmpty()) break;
                extracted.add(letters.poll());
            }
            return extracted;
        }

    public Queue<Character> getLetters() {
        return letters;
    }
}

