package game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class Game implements Initializable {
    boolean running = false;
    Random random = new Random();

    @FXML
    private Text playerHand;

    @FXML
    private Text dealerHand;

    public void initialize(URL location, ResourceBundle resources){
        gameEngine();
    }
    
    public void gameEngine(){
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
        // text.setText(Card.displayPlayerHand(player.hand));
        // Card.displayDealerHand(dealer.hand, dealer.handTotal);
        
    }
}
