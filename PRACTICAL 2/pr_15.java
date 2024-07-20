/*
 * Write a program that will create two strings using new keyword, compare them and 
show true if they are same, append second to first
 */

public class pr_15 {
    public static void main(String args[]) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        boolean areEqual = str1.equals(str2);
        System.out.println(" are the strings equal ? "+ areEqual);

        if (areEqual) {
            str1 = str1 + str2;
            System.out.println(" after appending, str1: " + str1);
        }

    }
}