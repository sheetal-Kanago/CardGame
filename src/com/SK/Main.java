package com.SK;

public class Main {

    public static void main(String[] args) {
        //Stage 2
//        CardGame myCardGame= new CardGame("SK");
//        System.out.println(myCardGame.getDeckOfCards());
//
//        myCardGame.sortDeckInNumberOrder();
//        System.out.println(myCardGame.getDeckOfCards());
//
//        myCardGame.sortDeckIntoSuits();
//        System.out.println(myCardGame.getDeckOfCards());
//
//        myCardGame.shuffleDeck();
//        System.out.println(myCardGame.getDeckOfCards());

        //Stage 3
        Snap snap=new Snap("snap");
        snap.playSnap();

////           Test Players class
//        Players<Player> players=new Players<>();
//        players.add(new Player("One"));
//        players.add(new Player("Two"));
//        players.add(new Player("Three"));
//        players.add(new Player("Four"));
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(players.getNextPlayer().getName());
//        }

////        test CArdGame
//            CardGame CG = new CardGame("SK");
//        for (int i = 0; i < 200; i++) {
//            System.out.println(CG.dealCard());
//        }

    }
}
