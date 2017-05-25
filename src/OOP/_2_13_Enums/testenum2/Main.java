package OOP._2_13_Enums.testenum2;
/*
 * 1) Create two enum type: Suit (which have SPADE, DIAMOND, CLUB, HEART) and
 * Rank (which have ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING values}.
 * 2)Create class Card which has two private fields: cardSuit of Suit type and cardRank of Rank type.
 * Add to Card constructor with cardSuit and cardRank arguments.
 * In class Card override toString() method to return full name of card.
 */

public class Main {
    static int i = 0;


    //In method main() create and fill (using nested loops) array of Card objects (standard 52-card deck).
    public static Card[] initColoda(){
        Card [] coloda = new Card[52];
        for (Suit suit: Suit.values())
            for (Rank rank: Rank.values()) {
                coloda[i] = new Card(suit, rank);
                i++;
            }
        return coloda;
    }

    public static void main(String[] args) {

        //Add code which iterate over Card array and print full card name to console.
        Card []cards = initColoda();
        for (Card card: cards)
            System.out.println(card);
    }
}
