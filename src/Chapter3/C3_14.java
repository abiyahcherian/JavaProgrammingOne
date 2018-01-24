package Chapter3;

import java.util.Scanner;

/**
 * Program to play heads or tails
 *
 * @author Abiyah Cherian
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //listing 3.14 
        Scanner input = new Scanner(System.in);
        //recieve an input
        System.out.print("Choose heads or tails, where heads is 0 and tails is 1:");
        int guess = input.nextInt();
        //1. generate random number between 0 and 1
        int coin = (int) (Math.random() * 2);
        //if else statement
        if (coin == guess) {
            System.out.println("You are correct! The input was " + coin);
        } else {
            System.out.println("You are incorrect");
            System.out.println("The correct input is " + coin);

        }
    }
}
