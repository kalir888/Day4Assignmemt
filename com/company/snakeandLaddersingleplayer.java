package com.company;

import java.util.Scanner;

public class snakeandLaddersingleplayer{
    public static final int INITIAL_POSITION=0;
    public static final int WINNING_POSITION=100;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String args[]){
        long playerPosition = INITIAL_POSITION;
        int diceRolls = 1;
        while (playerPosition != WINNING_POSITION){
            Scanner in = new Scanner(System.in);
            System.out.println("press 1 and enterkey to roll the dice");
            int userPress = in.nextInt();
            if (userPress == 1){
                long dice = ((Math.round(Math.random()*10)%5)+1);
                System.out.println("dice = " + dice);
                int option = (int)(Math.round(Math.random()*10)%3);
                switch (option){
                    case SNAKE:
                        playerPosition = playerPosition - dice;
                        System.out.println("oh! ooh! you got snake");
                        break;
                    case LADDER:
                        playerPosition = playerPosition + dice;
                        System.out.println("wow! you got ladder");
                        break;
                    default:
                        System.out.println("well you got no play");
                        break;
                }
                if (playerPosition > WINNING_POSITION)
                    playerPosition = playerPosition - dice;
                else if (playerPosition < INITIAL_POSITION)
                        playerPosition = INITIAL_POSITION;
                System.out.println("current player position is = " + playerPosition);
            }else{
                System.out.println("Invalid key entered");
            }
            diceRolls++;
        }
        System.out.println("PLAYER WON");
        System.out.println("Total Times of dice rolled = " + diceRolls);
    }
}
