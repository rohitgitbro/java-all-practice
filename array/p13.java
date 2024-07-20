
//13	Write a program to search in the int array with use of for each style for loop.

public class p13 {
    public static void  main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int key = 0;
        int i;
        for (i = 0; i <= a.length; i++) {
            if (a[i] == key) {
                System.out.println("element number is :" + i);
                break;
            }

        }
        if (i == a.length)
            System.out.println("element is not found");
    }

}
