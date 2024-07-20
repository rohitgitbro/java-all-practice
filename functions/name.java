// package functions;

import java.util.Scanner;

public class name {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    // public static int printMyName(String name){
    // System.out.println(name);
    // return 1;
    // }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name to print");
        String name = sc.nextLine();

        printMyName(name);

    }

}
