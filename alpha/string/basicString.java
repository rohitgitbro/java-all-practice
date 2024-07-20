import java.util.*;

public class basicString{

    public static void printLetter(String str){
        for(int i=0; i<= str.length() - 1; i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

      
        // char arr[] = {'a','b','c','d'};
        // String str = "pqrs";
        // String str1 = new String("xyz@!#$2224555");
        
        /*
         * STRINGS ARE IMMUTABLE I.E. ek var declare larya pa6i change na kari sakay
         */

        // System.out.println(arr);
        // System.out.println(str);
        // System.out.println(str1);

        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next(); // consist only one string ex. rohit parmar output= rohit 
        
        // name = sc.nextLine();
        // System.out.println(name);

    //    // for finding length
    //    String fullName = "own day";
    //    System.out.println(fullName.length());

    //for concatenation
    String fName = "own";
    String lName = "day";

    String fullName = fName + " "+lName;
    System.out.println(fullName);
    // System.out.println(fullName + " is this");

    //System.out.println(fullName.charAt(2));

    printLetter(fullName);








    }
}