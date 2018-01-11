package Chapter3;

import java.util.Scanner;

/**
 * Program to find the greater package of two items
 *
 * @author Abiyah Cherian
 */
public class C3_33 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Enter scanner and package statement
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        //divide and put in variable
        double package1 = (weight1 / price1);
        //Enter statement for package 2 
        System.out.println("Enter weight and price for package 2:");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        //put in variable
        double package2 = (weight2 / price2);
        //if else statement
        if (package1 >= package2) {
            System.out.println(" Package 1 has a better price. ");
        } else {
            System.out.println("Package 2 has a better price. ");
        }
        //if statement
        if (package1 == package2) {
            System.out.println("Two  packages have the same price. ");
        }
    }
}
