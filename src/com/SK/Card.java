package com.SK;

public class Card {
    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol){
        this.suit = suit;
        this.symbol = symbol;
        switch(symbol){
            case "2": case "3": case "4" : case "5": case "6" : case "7" : case "8" : case "9" : case "10":
                this.value=Integer.parseInt(symbol);
                break;
            case "J":
                this.value=11;
                break;
            case "Q":
                this.value=12;
                break;
            case "K":
                this.value=13;
                break;
            case "A":
                this.value=14;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + symbol);
        }

    }

    @Override
    public String toString() {
        return suit +symbol;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
//    users.sort(Comparator.comparing(User::getCreatedOn));
}