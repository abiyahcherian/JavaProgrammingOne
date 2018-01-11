package Chapter2;

import java.util.Scanner;

/**
 * Program to find area and volume of a cylinder
 *
 * @author Abiyah Cherian
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        final double PIE = Math.PI;
        System.out.print(" The area is ");
        //area conversion
        System.out.print(radius * radius * PIE);
        System.out.print(" The volume is ");
        //volume conversion
        System.out.print((radius * radius * PIE) * length);
    }
}
