/*
 * 	Write a program to search in the int array with use of for each style for loop in java

 */

public class pr_13 {
    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        int target = 30;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;

            }
        }
        if (found) {
            System.out.println("element " + target + " found in array");

        } else {
            System.out.println("element " + target+  " nottt found in array");

        }
    }

}
