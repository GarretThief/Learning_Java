package OOP.labs_2_13;

public class Laba_4 {
  enum Suit {
    SPADE,
    DIAMOND,
    CLUB,
    HEART
  }

  enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
  }

  public static void main(String[] args) {
    Suit[] suteValues = Suit.values();
    Rank[] rankValues = Rank.values();
    Card[] cards = new Card[52];
    int counter = 0;
    for (int i = 0; i < suteValues.length; i++) {
      for (int j = 0; j < rankValues.length; j++) {
        cards[counter] = new Card(suteValues[i], rankValues[j]);
        System.out.println(cards[counter++].toString());
      }
    }
  }
}

// INNER CLASS HERE -->>
class Card {
  private Laba_4.Suit cardSuit;
  private Laba_4.Rank cardRank;

  public Card(Laba_4.Suit cardSuit, Laba_4.Rank cardRank) {
    this.cardSuit = cardSuit;
    this.cardRank = cardRank;
  }

  @Override
  public String toString() {
    return cardSuit.toString() + " - " + cardRank.toString();
  }
}