package Chapter4;

import java.util.Scanner;

/**
 * Program to find employee's status
 *
 * @author Abiyah Cherian
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //enter statementssss
        System.out.print(" Enter employee's name: ");
        String name = input.nextLine();

        System.out.print(" Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print(" Enter hourly pay rate: ");
        double pay = input.nextDouble();

        System.out.print(" Enter federal tax withholding rate: ");
        double fed = input.nextDouble();

        System.out.print(" Enter state tax witholding rate: ");
        double state = input.nextDouble();
        //new variables to find gross, rate, gross, and deductions
        double gross = (pay * hours);

        double per1 = (fed * 100);

        double per2 = (state * 100);

        double fe = (fed * gross);

        double st = (state * gross);

        double total = (st + fe);

        double net = (gross - total);
        //final statements to print
        System.out.printf(" Employee name: %s", name);

        System.out.printf("\n Hours Worked: %.2f", hours);

        System.out.printf("\n Pay Rate: %.2f", pay);

        System.out.printf("\n Gross Pay: %.2f", gross);

        System.out.printf("\n Deductions: ");

        System.out.printf("\n\t Federal Witholding:(" + per1 + "): $%.2f", fe);

        System.out.printf("\n\t State Witholding: (" + per2 + "): $%.2f", st);

        System.out.printf("\n\t Total Deduction: $ %.2f", total);

        System.out.printf("\n Net Pay: $%.2f", net);

    }
}
