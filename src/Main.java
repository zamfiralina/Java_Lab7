public class Main {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.setBag(new Bag());
        game.setBoard(new Board());
        game.addPlayer(new Player("Player1"));
        game.addPlayer(new Player("Player2"));
        game.addPlayer(new Player("Player3"));

        game.start();
    }
}
