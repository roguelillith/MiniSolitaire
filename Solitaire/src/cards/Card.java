package cards;

public class Card{
    public int house;
    public boolean color;
    public boolean shown;
    public int value;

    public Card( int house, boolean color, boolean shown, int value) {
        this.house = house;
        this.color = color;
        this.shown = shown;
        this.value = value;
    }
}