package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit
 *
 * @author Abiyah Cherian
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        //conversion to fahrenheit 
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + " Celsius " + " is " + fahrenheit + " in fahrenheit ");
    }
}
