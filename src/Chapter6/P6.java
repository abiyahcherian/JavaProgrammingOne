package Chapter6;

import java.util.Scanner;

/**
 * Program to convert calculate conversions of Dollars to Euros, Pounds, and
 * Yens
 *
 * @author Abiyah Cherian
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double dol = 0;
        double fore = 0;
        double n = 0.10;
        double conv1 = (dol * fore);
        double conv2 = (conv1 * n);
        double conv3 = 0.05;
        double conv4 = (conv1 * conv3);
        double conv5 = (conv1 - conv2);
        double conv6 = (conv1 - conv4);
        String more = "";

        System.out.println(" How many Euros does a dollar buy?: ");
        double e = input.nextDouble();
        System.out.println(" How many Pound Sterlings does a dollar buy?: ");
        double p = input.nextDouble();
        System.out.println(" How many Yen does a dollar buy?: ");
        double y = input.nextDouble();

        // start loop to start conversions
        do {

            System.out.println(" Please enter the number of dollars you want to convert ");
            double d = input.nextDouble();

            System.out.println(" Enter 'E' to buy Euros, 'P' for Pound Sterling, or 'Y' for Yen: ");
            String let = input.next().toUpperCase();
            char z = let.charAt(0);

            switch (z) {
                case 'E':
                    double o = convert(e, d);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.", d, o);
                    break;
                case 'P':
                    double v = convert(p, d);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterling.", d, v);
                    break;
                case 'Y':
                    double c = convert(y, d);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.", d, c);
                    break;
            }

            System.out.println(" Are there more conversions to perform? : ");
            more = input.next().toLowerCase();

            if (more.contains("no")) {
                System.exit(0);
            } else if (more.contains("yes")) {
                continue;
            } else {
                System.out.println(" Enter yes to continue and no to stop: ");
            }
            more = input.next().toLowerCase();

        } while (more.contains("yes"));

    }

    /**
     * Convert Method
     *
     * @param dol foreign currency
     * @param fore dollar amount
     * @return converted amount
     */
    public static double convert(double dol, double fore) {
        double n = 0.10;
        double conv1 = (dol * fore);
        double conv2 = (conv1 * n);
        double conv3 = 0.05;
        double conv4 = (conv1 * conv3);
        double conv5 = (conv1 - conv2);
        double conv6 = (conv1 - conv4);
        if (fore <= 100) {
            return (conv5);
        } else {
            return (conv6);
        }

    }
}
