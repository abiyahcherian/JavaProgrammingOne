package Chapter7;

import java.util.Scanner;

/**
 * Program to create two lists and then compare both lists
 *
 * @author Abiyah Cherian
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter List 1: ");
        int size = input.nextInt();

        int[] list1 = new int[size];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter List 2: ");

        int size2 = input.nextInt();

        int[] list2 = new int[size2];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Boolean Method Equals
     *
     * @param list1 array of list1
     * @param list2 array of list2
     * @return whether the two lists are exactly the same or not
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;

    }
}
