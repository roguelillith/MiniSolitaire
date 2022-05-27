package cards;

import java.util.Stack;

public class Deck{
    private int numberOfHouses;
    private int numberOfCardsPerHouse;
    public Stack<Card> deck = new Stack<>();
    private int deckSize;

    public Deck(int houses, int cardsPerHouse){
        this.numberOfHouses = houses;
        this.numberOfCardsPerHouse = cardsPerHouse;
        this.deckSize = houses * cardsPerHouse;
        for(int i = 0; i < houses; i++){
             for(int j = 0; j < cardsPerHouse; j++){
                 // for house: heart = 00, spade = 01, diamond = 10, clover = 11
                 // for color: red = 0, black = 1
                 Card card = new Card(i,i%2,false,j);
                 deck.push(card);
             }
        }
    }

    public void showCards(){
        for(int i = 0; i < deckSize; i++){
            System.out.println("Card "+i);
            deck.pop().showCard();
            System.out.println();
        }
    }
}