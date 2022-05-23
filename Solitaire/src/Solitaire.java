import cards.*;
import java.io.*;
import java.util.*;
public class Solitaire {
    public static void main (String[] args) {
        Stack<String> newGame = new Stack<String>();

        newGame.push("As");
        newGame.push("2s");
        newGame.push("3s");
        newGame.push("Ah");
        newGame.push("2h");
        newGame.push("3h");

        System.out.println(newGame);

    }
}
