package game;

import java.util.Arrays;

public class Game {
    boolean running = false;

    public Game(){
    }

    public void GameEngine(){
        running = true;
        Player player = new Player("Challenger");
        Deck deck = new Deck();
        deck.newDeck();

    }
}
