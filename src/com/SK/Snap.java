package com.SK;

import java.util.Scanner;

public class Snap extends CardGame{

    public Snap(String name) {
        super(name);
    }

    public void playSnap() {
        boolean gameOver=false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Name of Player 1 and hit enter:");
        String P1 =scanner.nextLine();
        Player player1=new Player(P1);

        System.out.println("Type Name of Player 2 and hit enter:");
        String P2 =scanner.nextLine();
        Player player2=new Player(P2);
        System.out.println("Starting game Snap. Press any key to deal the 1st card:");

        System.out.println(player1.getName() +"  "+player2.getName());

        Card prevCard = null, currentCard;
        this.shuffleDeck();
        while (!gameOver && scanner.nextLine()!=null){
            try{
                currentCard=dealCard();
                System.out.println(currentCard.toString());
            }
            catch (Exception e){
                this.shuffleDeck();
                continue;
            }
            if(prevCard!=null && prevCard.getValue() == (currentCard.getValue())){
//                System.out.println(prevCard.toString() +" "+ currentCard.toString()+" Game over!!");
                System.out.println("Game over!!!");
                gameOver=true;
            }else{
                prevCard=currentCard;
            }
        }


    }
}
