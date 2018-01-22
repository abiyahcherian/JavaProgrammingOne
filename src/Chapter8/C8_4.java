package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to print out the hours of each employee for each day and then the
 * total
 *
 * @author Abiyah Cherian
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //fill array
        int[][] weeklyHrs = {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9}};
        System.out.println("\t   Su  M  T  W  Th F  Sa  Total ");
        int[] something = sum(weeklyHrs);

        //print numbers
        for (int i = 0; i < weeklyHrs.length; i++) {

            System.out.print("Employee " + i + ": ");
            System.out.println(Arrays.toString(weeklyHrs[i]) + "  " + something[i]);

        }
        Arrays.sort(something);

        for (int i = 0; i < something.length / 2; i++) {
            int high = something[i];
            something[i] = something[something.length - 1 - i];
            something[something.length - 1 - i] = high;
        }
        System.out.printf("\n Employee 7:" + something[0] + "\n Employee 6:" + something[1] + "\n Employee 0:" + something[2] + "\n Employee 4:" + something[3] + "\n Employee 3:" + something[4] + "\n Employee 1:" + something[5] + "\n Employee 5:" + something[6] + "\n Employee 2:" + something[7]);
    }

    /**
     * Sum Method
     *
     * @param x array to find sum of each employee
     * @return sum
     */
    public static int[] sum(int[][] x) {
        int[] sumA = new int[8];
        for (int i = 0; i < sumA.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sumA[i] += x[i][j];

            }

        }
        return sumA;
    }

}
