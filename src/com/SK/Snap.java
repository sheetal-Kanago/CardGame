package com.SK;

import java.util.Scanner;

public class Snap extends CardGame{

    public Snap(String name) {
        super(name);
    }

    public void playSnap() {
        boolean gameOver=false;
        Scanner scanner = new Scanner(System.in);
        Players<Player> players = new Players<>();
        Player currentPlayer;

        System.out.println("How may players (1-9)?");
        int playerCount = scanner.nextInt();
        if (playerCount <0 || playerCount >9){
            System.out.println("Invalid input. Bye!");
        }else{
            for (int i = 0; i < playerCount; i++) {
                System.out.println("Player "+(i+1)+":");
                players.add(new Player(scanner.next()));
            }
            System.out.println("Starting game Snap....");
            Card prevCard = null, currentCard;
            currentPlayer=players.getNextPlayer();
            this.shuffleDeck();
            scanner.nextLine();
            while (!gameOver) {
                System.out.println(currentPlayer.getName() + "'s turn. Press enter:");
                scanner.nextLine();
                try {
                    currentCard = dealCard();
                    System.out.println(currentCard.toString());
                } catch (Exception e) {
                    this.shuffleDeck();
                    continue;
                }
                if (prevCard != null && prevCard.getSuit() == (currentCard.getSuit())) {
                    //                System.out.println(prevCard.toString() +" "+ currentCard.toString()+" Game over!!");
                    System.out.println("Player " + currentPlayer.getName() + " wins!!2");
                    gameOver = true;
                } else {
                    prevCard = currentCard;
                    currentPlayer = players.getNextPlayer();
                }
            }
        }
    }
}
