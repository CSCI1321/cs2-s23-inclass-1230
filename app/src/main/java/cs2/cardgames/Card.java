package cs2.cardgames;

public class Card {
  //Constants
  public static final int SPADE = 0;
  public static final int HEART = 1;
  public static final int DIAMOND = 2;
  public static final int CLUB = 3;
  private static char[] suitSymbols = {'\u2660', '\u2665', '\u2666', '\u2663'};

  //Fields
  private int suit;
  private int rank;

  //Constructor
  public Card(int s, int r) {
    this.suit = s;
    this.rank = r;
  }
  public Card() {
    this.suit = 0;
    this.rank = 1;
  }

  //Methods
  public int getSuit() {
    return this.suit;
  }
  public int getRank() {
    return this.rank;
  }
  public boolean isAce() {
    return this.rank == 1;
  }
  public boolean isFaceCard() {
    return this.rank >= 11;
  }
  public int getValue() {
    if(isFaceCard()) {
      return 10;
    } else {
      return this.rank;
    }
  }

  public String toString() {
    String rankString = "";
    if(this.rank == 1) {
      rankString = "A";
    } else if(this.rank == 11) {
      rankString = "J";
    } else if(this.rank == 12) {
      rankString = "Q";
    } else if(this.rank == 13) {
      rankString = "K";
    } else {
      rankString = String.valueOf(this.rank);
    }
    return rankString + suitSymbols[this.suit];
  }

  public static void main(String[] args) {
    Card c = new Card(HEART, 13);
    System.out.println(c);
    Card d = new Card();
    System.out.println(d);
  }

}
