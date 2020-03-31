package game;

public abstract class Game {
	 
    protected int playersCount;

    public abstract void initializeGame();

    public abstract void makePlay(int player);

    public abstract boolean endOfGame();

    public abstract void printWinner();

    /* A template method : */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()){
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }
}
