package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to find average of a list of numbers and then print the content of
 * the array
 *
 * @author Abiyah Cherian
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum;
        System.out.println("How many numbers will be read: ");
        int[] num = new int[input.nextInt()];
        // filling the array
        System.out.println("Enter " + num.length + " elements:");
        Scanner Scanner = new Scanner(System.in);

        read(num, Scanner);
        System.out.println("The average is " + average(num));
        content(num);

    }

    /**
     * Read Method
     *
     * @param num each array position
     * @param input scanner input to read numbers entered
     */
    public static void read(int[] num, Scanner input) {
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) input.nextDouble();

        }
    }

    /**
     * Average Method
     *
     * @param num reads each position in the array
     * @return the average of all numbers is returned
     */
    public static double average(int[] num) {
        double sum = 0;
        for (int i = 0; i < num.length; i++) {

            sum += num[i];
        }
        double average;
        average = sum / num.length;
        return average;
    }

    /**
     * Content Method
     *
     * @param num reads the array to print the array
     */
    public static void content(int[] num) {
        System.out.println("The contents of the array are: \n" + java.util.Arrays.toString(num));
    }

}
