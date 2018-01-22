package Chapter7;

import java.util.Scanner;

/**
 *Program with array to find grade of changing number of students 
 * 
 * @author Abiyah Cherian
 */
public class C7_1 {

    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int[] students = new int[input.nextInt()];

        // Filling the array
        System.out.println(" Enter " + students.length + " scores");
        for (int i = 0; i < students.length; i++) {
            students[i] = input.nextInt();

        }

        //obtaining the best score
        int bestScore = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i] > bestScore) {
                bestScore = students[i];

            }
        }

        // Display the output
        int a = 0;
        for (int x : students) {
            System.out.println("Student " + (a++) + " score is " + x + " and grade is " + grade(x, bestScore));
        }
    }
    /**
     * 
     * @param score score of each student
     * @param best best score of student used to curve other grades
     * @return letter grade
     */
    
    public static char grade(int score, int best) {
        if (score >= (best - 10)) {
            return 'A';
        } else if (score >= (best - 20)) {
            return 'B';
        } else if (score >= (best - 30)) {
            return 'C';
        } else if (score >= (best - 40)) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
