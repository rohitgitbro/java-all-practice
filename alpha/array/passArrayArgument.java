import java.util.*;
/* array as function argument
// pass array by reference
// not pass by value : i.e. function ma je changes thai e main code ma reflect na thai
*/public class passArrayArgument {
    public static void update(int marks[], int nonChangable) {
        for (int i = 0; i < marks.length; i++) 
        {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String args[]) 
    {
        int marks[] = { 97, 98, 99 };
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        for (int i = 0; i < marks.length; i++)
         {
            System.out.print(marks[i] + " ");

        }
        System.out.println();
    }

}