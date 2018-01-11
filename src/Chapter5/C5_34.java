/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.util.Scanner;

/**
 *Program to play Rock, Paper, Scissors against a computer
 * 
 * @author Abiyah Cherian
 */
public class C5_34 {
    /**
     * Main Method 
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //statements
        int count = 0;
        int guessWins = 0;
        int compWins = 0;

        while (count < 3) {

            System.out.println(" Enter 0 for scissor, 1 for rock, and 2 for paper: ");
            int guess = input.nextInt();
            int comp = (int) (Math.random() * 3);

            //while
            //if statement 
            if (guess != 0 && guess != 1 && guess != 2) {
                System.out.println(" Invalid Input ");
                System.exit(0);
            }

            //first switch 
            switch (comp) {
                case 0:
                    System.out.print("The computer is scissor. ");
                    break;
                case 1:
                    System.out.print("The computer is rock. ");
                    break;
                case 2:
                    System.out.print("The computer is paper. ");
                    break;
            }

            //second switch statement
            switch (guess) {
                case 0:
                    System.out.print("You are scissor. ");
                    break;
                case 1:
                    System.out.print("You are rock. ");
                    break;
                case 2:
                    System.out.print("You are paper. ");
                    break;
            }
            //if statement
            if (guess == comp) {
                System.out.println("It's a draw");
            } else if (guess == 0 && comp == 1) {

                System.out.println("The computer wins." + compWins++);
            } else if (guess == 1 && comp == 0) {

                System.out.println(" You win. " + guessWins++);
            } else if (guess == 0 && comp == 2) {

                System.out.println("You win. " + guessWins++);
            } else if (guess == 2 && comp == 0) {

                System.out.println("The computer wins. " + compWins++);
            } else if (guess == 1 && comp == 2) {

                System.out.println("The computer wins. " + compWins++);
            } else if (guess == 2 && comp == 1) {

                System.out.println("You win. " + guessWins++);
            }

            count++;
        }
        if (guessWins < compWins) {

            System.out.println(" The computer won more than two times. ");
        } else if (guessWins > compWins) {

            System.out.println(" You won more than two times ");
        }

    }

}
