package DesignPatterns;

class PlayingCard {
    public String Type;
    public int Value;
    public String Suit;

}
class HoylePlayingCard extends PlayingCard {
    private String type;
    private int value;
    private String suit;

    public HoylePlayingCard(int value, String suit){
        this.type = "Hoyle";
        this.value = value;
        this.suit = suit;
        SetType();
        SetValue();
        SetSuit();
    }
    public void SetType() {
        Type = this.type;
    }
    public void SetValue() {
        Value = this.value;
    }
    public void SetSuit(){
        Suit = this.suit;
    }

}
class CongressPlayingCard extends PlayingCard {
    private String type;
    private int value;
    private String suit;

    public CongressPlayingCard(int value, String suit){
        this.type = "Congress";
        this.value = value;
        this.suit = suit;
        SetType();
        SetValue();
        SetSuit();
    }
    public void SetType() {
        Type = this.type;
    }
    public void SetValue() {
        Value = this.value;
    }
    public void SetSuit(){
        Suit = this.suit;
    }
}

abstract class CardFactory {
    public abstract PlayingCard GetPlayingCard();
}

class HoyleFactory extends CardFactory {
    private String type;
    private int value;
    private String suit;

    public HoyleFactory(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public PlayingCard GetPlayingCard(){
        return new HoylePlayingCard(value, suit);
    }
}

class CongressFactory extends CardFactory {
    private String type;
    private int value;
    private String suit;

    public CongressFactory(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public PlayingCard GetPlayingCard() {
        return new CongressPlayingCard(value, suit);
    }
}

public class Factory1 {
        public static void main (String[] args) {
            CardFactory factory = new HoyleFactory(5,"spades");
            PlayingCard playingCard = factory.GetPlayingCard();
            System.out.println("Card Type: " + playingCard.Type +
                               " Card Value: " + playingCard.Type +
                               " Card Suit: " + playingCard.Suit);
        }
}
