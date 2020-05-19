package game;

public class Card {
    String name;
    String suit;
    int value;

    public Card(String name, String suit, int value){
        this.name = name;
        this.suit = suit;
        this.value = value;
    }

    public static void displayCurrentHand(Card[] playerHand, int playerHandTotal, Card[] dealerHand, int dealerHandTotal){

        System.out.println("\n******Dealer's Hand******\n");

        for( Card card : dealerHand){
            if(card != null){
                System.out.println(card.name + " of " + card.suit);
                playerHandTotal += card.value;
            }

        }
        System.out.println("Player Total: " + playerHandTotal);

        System.out.println("\n******Player's Hand******\n");

        for( Card card : playerHand){
            if(card != null){
                System.out.println(card.name + " of " + card.suit);
                dealerHandTotal += card.value;
            }
        }
        System.out.println("Dealer Total: " + dealerHandTotal);

    }

}
