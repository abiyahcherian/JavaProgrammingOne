package Chapter4;

import java.util.Scanner;

/**
 * Program to find whether there is a substring within a statement or not
 *
 * @author Abiyah Cherian
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //enter statement
        System.out.println("Enter string s1: ");

        String s1 = input.next();

        System.out.println("Enter string s2: ");

        String s2 = input.next();
        //compare using .contains
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
