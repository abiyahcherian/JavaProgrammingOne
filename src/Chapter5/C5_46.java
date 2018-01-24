package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string
 *
 * @author Abiyah Cherian
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //first statement
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The reversed string is " + (new StringBuffer(s).reverse().toString()));

    }
}
