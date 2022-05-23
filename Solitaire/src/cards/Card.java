package cards;

public class Card{
    private int house;
    private int color;
    private boolean shown;
    private int value;

    //Constructor
    public Card( int house, boolean color, boolean shown, int value) {
        this.setHouse(house);
        this.setColor(color);
        this.setShown(shown);
        this.setValue(value);
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public boolean isShown() {
        return shown;
    }

    public void setShown(boolean shown) {
        this.shown = shown;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}