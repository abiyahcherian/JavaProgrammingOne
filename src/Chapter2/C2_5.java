package Chapter2;

import java.util.Scanner;

/**
 * Program to find total and gratuity
 *
 * @author Abiyah Cherian
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        final double GRAT = (gratuityRate / subtotal);
        //find gratuity
        System.out.print("The gratuity is $");
        System.out.print(gratuityRate / subtotal);
        //find total 
        System.out.print("  and the total is $");
        System.out.print(subtotal + GRAT);
    }
}
