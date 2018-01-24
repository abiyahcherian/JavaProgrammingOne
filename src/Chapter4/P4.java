package Chapter4;

import java.util.Scanner;

/**
 * Program to compare 2 Bidders and find best option
 *
 * @author Abiyah Cherian
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//enter name of first 
        System.out.print(" Enter name of first bidder: ");
        String name1 = input.next();
        System.out.print(" Enter number of hours required for project: ");
        int hour1 = input.nextInt();
        System.out.print(" Enter amount to be charged per hour: ");
        double rate1 = input.nextDouble();

// enter name of second
        System.out.print(" Enter name of second bidder: ");
        String name2 = input.next();
        System.out.print(" Enter number of hours required for project: ");
        int hour2 = input.nextInt();
        System.out.print(" Enter amount to be charged per hour: ");
        double rate2 = input.nextDouble();

//calc costs
        double dHour1 = (double) hour1;
        double dHour2 = (double) hour2;
        double cost1 = (dHour1 * rate1);

        double cost2 = (dHour2 * rate2);

//if statements
        if (cost1 < cost2) {
            System.out.printf(" The winner is %s with a price of $%.2f", name1, cost1);
        } else if (cost1 > cost2) {
            System.out.printf("\n The winner is %s with a price of $%.2f ", name2, cost2);
        } else if ((cost1 == cost2) && (hour1 < hour2)) {
            System.out.printf(" \n The winner is %s with a price of $%.2f ", name1, cost1);
            System.out.printf("\n and number of " + hour1 + " hours");
        } else if ((cost1 == cost2) && (hour1 > hour2)) {
            System.out.printf(" \n The winner is %s with a price of $%.2f ", name2, cost2);
            System.out.printf("\n and " + hour2 + " hours");
        } else {
            System.out.printf(" \n The bids are identical \n Number of hours: \n First Bidder = " + hour1 + " \n Second Bidder  = " + hour2);
            System.out.printf(" \n Cost per hour: \n First Bidder = $" + rate1 + "\n Second Bidder = $" + rate2);
            System.out.printf(" \n Total Cost: \n First Bidder = $ " + cost1 + "\n Second Bidder = $" + cost2);
        }

    }
}
