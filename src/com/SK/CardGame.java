package com.SK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    private String name;
    private ArrayList<Card> deckOfCards = new ArrayList();
    private int topOfDeck=0;

    public CardGame(String name) {
        this.name=name;
        String[] suits = {"♦", "♥", "♠", "♣"};
        String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String suit:suits ) {
            for (String symbol:symbols) {
                deckOfCards.add(new Card(suit,symbol));
            }
        }
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public Card dealCard() {
        if(topOfDeck==52){
            topOfDeck=0;
            return deckOfCards.get(51);
        }else{
            topOfDeck++;
            return deckOfCards.get(topOfDeck-1);
        }

    }

    public void sortDeckInNumberOrder(){
        deckOfCards.sort(Comparator.comparing(Card::getValue));
    }

    public void sortDeckIntoSuits(){
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
        topOfDeck=0;
    }
}
