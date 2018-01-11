package Chapter3;

import java.util.Scanner;

/**
 * Program to find divisibility of an integer
 *
 * @author Abiyah Cherian
 */
public class C3_26 {
/**
         * Main Method
         *
         * @param args arguments from command line prompt
         */
    public static void main(String[] args) {
        
        //listing 3.26
        Scanner input = new Scanner(System.in);
        //type phrase
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        //Enter first if else statement(with and )
        System.out.println("Is " + number + " divisible by 5 and 6? ");
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //enter next if else statement(with or)
        System.out.println("Is " + number + " divisible by 5 or 6? ");
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //enter final if else statement
        System.out.println("Is " + number + " divisible by 5 or 6, but not both?");
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
