package game;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Game {
    boolean running = false;
    Random random = new Random();

    public Game(){
    }

    public void GameEngine(){
        running = true;
        Player player = new Player("Challenger");
        Dealer dealer = new Dealer();
        Deck deckObject = new Deck();
        Card[] deck = deckObject.newDeck();

        for(int i = 0; i < 2; i++){
            player.hand[i] = deck[random.nextInt(51)];
            dealer.hand[i] = deck[random.nextInt(51)];
        }

//        Game Loop Starts Here
        Card.displayCurrentHand(player.hand, player.handTotal, dealer.hand, dealer.handTotal);


    }
}
