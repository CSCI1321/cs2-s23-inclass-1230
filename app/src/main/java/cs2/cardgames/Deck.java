package cs2.cardgames;

import java.util.ArrayList;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
  //Field
  private ArrayList<Card> cards;

  //Constructor
  public Deck() {
    cards = new ArrayList<Card>();
  }

  public static Deck emptyDeck() {
    return new Deck();
  }
  public static Deck standardDeck() {
    Deck d = new Deck();
    int[] suits = { Card.SPADE, Card.HEART, Card.DIAMOND, Card.CLUB };
    for(int s=0; s<suits.length; s++) {
      for(int r=1; r<=13; r++) {
        d.add(new Card(suits[s], r));
      }
    }
    return d;
  }

  //Methods
  public Card deal() {
    return this.cards.remove(0);
  }
  public void add(Card c) {
    this.cards.add(c);
  }
  public Card getCard(int i) {
    return cards.get(i);
  }
  public int size() {
    return this.cards.size();
  }
  public boolean isEmpty() {
    return this.size() == 0;
  }
  public String toString() {
    return this.cards.toString();
  }
  public void shuffle() {
    /*
    Random rand = new Random();
    ArrayList<Card> tmp = new ArrayList<Card>();
    while(this.cards.size() > 0) {
      int randomIndex = rand.nextInt(this.cards.size());
      tmp.add(this.cards.remove(randomIndex));
    }
    this.cards = tmp;
    */
    Collections.shuffle(cards);
  }  
}

class DeckTester {
  public static void main(String[] args) {
    Deck d = Deck.standardDeck();
    System.out.println(d);
    d.shuffle();
    System.out.println(d);
  }
}