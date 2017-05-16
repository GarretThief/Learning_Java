package OOP._2_13_Enums.testenum2;

/**
 * Created by Garret on 07.03.2017.
 */
public class Card {

    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return cardRank + "_" + cardSuit;
    }
}
