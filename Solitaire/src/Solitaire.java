import cards.*;
import java.io*;
import java.util.*;
public class Solitaire {

    public static void main (String[] args) {
        Stack deck = new deck();

        deck.push("As");
        deck.push("2s");
        deck.push("3s");
        deck.push("Ah");
        deck.push("2h");
        deck.push("3h");

        System.out.println(deck);

    }
}
