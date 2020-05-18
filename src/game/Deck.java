package game;

import java.util.Arrays;
import java.util.Objects;

public class Deck {

    private int ace = 0;
    private int king = 10;
    private int jack = 10;
    private int queen = 10;
    private int ten = 10;
    private int nine = 9;
    private int eight = 8;
    private int seven = 7;
    private int six = 6;
    private int five = 5;
    private int four = 4;
    private int three = 3;
    private int two = 2;

    int[] values = {ace, king, jack, queen, ten, nine, eight, seven, six, five, four, three, two};
    String[] names = {"Ace", "King", "Jack", "Queen", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
    String[] suits = {"spade", "heart", "diamond", "clover"};

   public Card[] newDeck(){
       Card[] deck = new Card[52];
       int deckIndex = 0;


       for(int i = 0; i <= suits.length - 1; i++) {
           for(int j = 0; j <= values.length - 1; j++) {
               Card card = new Card(names[j], suits[i], values[j]);
               deck[deckIndex] = card;
               deckIndex++;
            }
       }

       return deck;

   }

//    random card draw
//    shuffle deck
//    multideck?

}
