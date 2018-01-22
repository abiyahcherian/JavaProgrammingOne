package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to keep track of all sales by enter Sales ID, day of week and sales
 * amount
 *
 * @author Abiyah Cherian
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] salesP = new double[4][5];
        String w;
        char q = 0;
        while (q != 'N') {
            //salesman
            System.out.print("Enter the salesman ID as A, B, C, or D: ");
            String j = input.next().toUpperCase();
            char k = j.charAt(0);
            int person = linearSearch(salesP, k);

            if (person == -1) {
                System.out.println("Enter a valid ID--- ");
                continue;
            }

            //day of the week
            System.out.print("Enter the day as M, T, W, H, or F: ");
            String o = input.next().toUpperCase();
            char p = o.charAt(0);
            int day = linearSearch(salesP, p);

            if (day == -1) {
                System.out.println("Enter a valid ID--- ");
                continue;
            }

            //sales
            System.out.print("Enter the amount of the sale: ");
            double u = input.nextDouble();
            salesP[person][day] = (u + (salesP[person][day]));

            //loop or nah
            System.out.print("More data? Enter Y for more or N to stop:");
            w = input.next().toUpperCase();
            q = w.charAt(0);

            if ((q != 'N') || (q != 'Y') || (q != 'y') || (q != 'n')) {
                System.out.print("Invalid input. Enter Y for more or N to stop: ");
                w = input.next().toUpperCase();
                q = w.charAt(0);
            }
        }

        System.out.println("\t    M    T    W    H    F ");
        //print array
        char let = 'A';
        for (int i = 0; i < salesP.length; i++) {

            System.out.print("Salesman " + let + " :");
            let++;
            System.out.println(Arrays.toString(salesP[i]));

        }

    }

    /**
     * Linear Search Method
     *
     * @param sales sales position in array
     * @param key letter entered to find right salesman
     * @return
     */
    //linearSearch method 
    public static int linearSearch(double[][] sales, char key) {
        int something = -1;
        switch (key) {
            case 'A':
                something = 0;
                break;
            case 'B':
                something = 1;
                break;
            case 'C':
                something = 2;
                break;
            case 'D':
                something = 3;
                break;
            case 'M':
                something = 0;
                break;
            case 'T':
                something = 1;
                break;
            case 'W':
                something = 2;
                break;
            case 'H':
                something = 3;
                break;
            case 'F':
                something = 4;
                break;
            default:
                return something;

        }
        return something;

    }
}
