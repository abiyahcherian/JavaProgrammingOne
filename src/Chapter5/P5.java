package Chapter5;

import java.util.Scanner;

/**
 * Program to vote and keep track of votes
 *
 * @author Abiyah Cherian
 */
public class P5 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //enter statement
        //declare variables
        char vote;
        char y = 'y';
        char n = 'n';
        char q = 'q';
        int y1 = 0;
        int n1 = 0;

        System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
        vote = input.next().charAt(0);

        //while loop to keep voting
        while (vote != q) {
            //if statements
            if (vote == 'y' || vote == 'Y') {
                y1++;
            } else if (vote == 'n' || vote == 'N') {
                n1++;
            } else if (vote == 'q' || vote == 'Q') {
                break;
            }

            System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
            vote = input.next().charAt(0);

            //break if q and list score
        }
        System.out.println("Yes votes:" + y1 + "\n No votes:" + n1);

    }
}
