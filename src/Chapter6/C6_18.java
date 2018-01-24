package Chapter6;

import java.util.Scanner;

/**
 * Program to create a valid/safe password
 *
 * @author Abiyah Cherian
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password:");

        String pass = input.nextLine();

        if (checkPass(pass)) {
            System.out.println(" Valid Password ");
        } else {
            System.out.println(" Invalid Password ");
        }
    }

    // new method
    /**
     * Boolean- Check Pass Method
     *
     * @param pass used to check password validity
     * @return valid password is true, invalid is false
     */
    public static boolean checkPass(String pass) {

        if (pass.length() < 8) {
            //check number of characters
            System.out.println(" A password must have at least eight characters ");
            return false;
        } else {
            //check letters or digits
            char p;
            int count = 0;
            //for loop to check each position
            for (int i = 0; i < pass.length(); i++) {
                p = pass.charAt(i);
                if (!Character.isLetterOrDigit(p)) {
                    System.out.println("A password must only contain letters and digits");
                    return false;
                } else if (Character.isDigit(p)) {
                    count++;

                }
            }
            //check number of digits
            if (count < 2) {
                System.out.println(" A password must contain at least two digits");
                return false;

            }
        }
        //return true if valid password
        return true;

    }

}
