package Poker;

public class Card {
    public String color;
    public String Csize;

    public Card(String color, String csize) {
        this.color = color;
        Csize = csize;
    }

    @Override
    public String toString() {
        return "(" + color + Csize +")" ;
    }
}
