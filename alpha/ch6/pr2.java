// returning array from method 

import java.util.*;

public class pr2 {

    public static void Get_data(int a[], int n) {
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter element : ");
            a[i]=sc.nextInt();
        }

    }
public static void put_data(int a[], int n)
 {
    System.out.println("th eelement are:");
        for (int i = 0; i < n; i++) {
            
           System.out.println(a[i]);
        }

    }

    public static void main(String args[]) {
        int a[] = new int[15];

        Scanner sc = new Scanner(System.in);
        System.out.println("how many element you want to in array : ");
        int n = sc.nextInt();
        Get_data(a,n);
        put_data(a,n);



    }

}
