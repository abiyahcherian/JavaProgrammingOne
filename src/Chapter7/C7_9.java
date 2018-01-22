package Chapter7;

import java.util.Scanner;

/**
 * Program to find minimum number out of 10 numbers
 *
 * @author Abiyah Cherian
 */
public class C7_9 {

    double mini;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //filling the array 
        double[] nums = new double[10];
        System.out.println("Enter ten numbers: ");
        //for loop to fill array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextDouble();
        }
        System.out.println("The minimum value is " + min(nums));

    }

    /**
     * Min Method
     *
     * @param nums numbers that fill the array
     * @return minimum value of all numbers
     */
    public static double min(double[] nums) {
        double min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];

            }

        }

        return min;
    }
}
