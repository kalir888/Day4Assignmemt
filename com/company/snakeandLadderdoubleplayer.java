package com.company;

import java.util.Scanner;

public class snakeandLadderdoubleplayer {
    public static final int INITIAL_POSITION=0;
    public static final int WINNING_POSITION=100;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String args[]){
        int flag = 1;
        long player1Position = INITIAL_POSITION;
        long player2Position = INITIAL_POSITION;
        int diceRolls = 1;
        while (player1Position != WINNING_POSITION & player2Position != WINNING_POSITION) {
            if (flag == 1) {
                System.out.println("Player 1 turn to roll the dice");
                Scanner in = new Scanner(System.in);
                System.out.println("press 1 and enterkey to roll the dice");
                int userPress = in.nextInt();
                if (userPress == 1) {
                    long dice = ((Math.round(Math.random() * 10) % 5) + 1);
                    System.out.println("dice = " + dice);
                    int option = (int) (Math.round(Math.random() * 10) % 3);
                    switch (option) {
                        case SNAKE:
                            player1Position = player1Position - dice;
                            System.out.println("oh! ooh! you got snake");
                            System.out.println("turn goes to player2");
                            flag = 2;
                            break;
                        case LADDER:
                            player1Position = player1Position + dice;
                            System.out.println("wow! you got ladder");
                            System.out.println("player1 got another turn");
                            break;
                        default:
                            System.out.println("Ooh! you got no play");
                            System.out.println("turn goes to player2");
                            flag = 2;
                            break;
                    }
                    if (player1Position > WINNING_POSITION)
                        player1Position = player1Position - dice;
                    else if (player1Position < INITIAL_POSITION)
                        player1Position = INITIAL_POSITION;
                    System.out.println("current position of player1 = " + player1Position);
                } else {
                    System.out.println("Invalid key entered");
                }
                diceRolls++;
            }else{
                System.out.println("Player 2 turn to roll the dice");
                Scanner in = new Scanner(System.in);
                System.out.println("press 1 and enterkey to roll the dice");
                int userPress = in.nextInt();
                if (userPress == 1) {
                    long dice = ((Math.round(Math.random() * 10) % 5) + 1);
                    System.out.println("dice = " + dice);
                    int option = (int) (Math.round(Math.random() * 10) % 3);
                    switch (option) {
                        case SNAKE:
                            player2Position = player2Position - dice;
                            System.out.println("oh! ooh! you got snake");
                            System.out.println("turn goes to player1");
                            flag = 1;
                            break;
                        case LADDER:
                            player2Position = player2Position + dice;
                            System.out.println("wow! you got ladder");
                            System.out.println("player2 got another turn");
                            break;
                        default:
                            System.out.println("Ooh! you got no play");
                            System.out.println("turn goes to player1");
                            flag = 1;
                            break;
                    }
                    if (player2Position > WINNING_POSITION)
                        player2Position = player2Position - dice;
                    else if (player2Position < INITIAL_POSITION)
                        player2Position = INITIAL_POSITION;
                    System.out.println("current position of player2 = " + player2Position);
                } else {
                    System.out.println("Invalid key entered");
                }
                diceRolls++;
            }
        }
        if (player1Position == WINNING_POSITION)
            System.out.println("PLAYER1 WON!");
        else
            System.out.println("PLAYER2 WON!");
        System.out.println("Total Times of dice rolled = " + diceRolls);
    }
}
