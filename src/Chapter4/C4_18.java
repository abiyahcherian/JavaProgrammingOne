package Chapter4;

import java.util.Scanner;

/**
 * Program to find major and status of a student
 *
 * @author Abiyah Cherian
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //enter statements
        System.out.println("Enter characters M, C, or I for major and Enter 1, 2, 3, or 4 for status:");
        String m = input.next().toUpperCase();
        char major = m.charAt(0);
        char status = m.charAt(1);

        //enter if statement to terminate
        if (status != '1' && status != '2' && status != '3' && status != '4') {
            System.out.println("Invalid input");
            System.exit(0);
        }

        //enter switch statements
        switch (major) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.print("Invalid input ");
                System.exit(0);
                break;
        }
        //next switch
        switch (status) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
        }
    }
}
