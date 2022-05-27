import cards.*;
import java.io.*;
import java.util.*;
public class Solitaire {

    public static void main (String[] args) {
        Deck firstDeck = new Deck(2,3);
        /*Positions 0-2 are for the first column in the game
        Positions 3-6 are for the second column in the game
        Positions 7-9 are for the draw deck
        Positions 10-12 are for the heart house ending positions
        Positions 13-15 are for the spade house ending positions*/

        firstDeck.showCards();

    }
}
