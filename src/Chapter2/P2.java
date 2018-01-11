package Chapter2;

import java.util.Scanner;

/**
 * Program to find subtotal, tax, tip, and total of a meal
 *
 * @author Abiyah Cherian
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of meal: ");
        double meal = input.nextDouble();

        System.out.print("Enter price of drink: ");
        double drink = input.nextDouble();

        System.out.print("Enter price of dessert: ");
        double dessert = input.nextDouble();
        //subtotal math
        double subtotal = meal + drink + dessert;
        //tax, tip, total
        double tax = subtotal * 0.10;
        double tip = (subtotal + tax) * 0.15;
        double total = subtotal + tax + tip;
        //display all
        System.out.print(" The subtotal is $" + subtotal);
        System.out.print(" The tax is $" + tax);
        System.out.print(" The tip is $" + tip);
        System.out.print(" The total cost is $" + total);
    }
}
