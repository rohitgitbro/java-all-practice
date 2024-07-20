/*
     package ex1.java;
5)write a function that takes in age as input and returns if that person 
is eligible to vote 
or not
 */
import java.util.Scanner;
public class q5 {
     public static int ageForVote(int age){
          if(age>18){
               System.out.println("person is eligible to vote ");
               return age;
          }
          else{
               System.out.println("not eligible");
               return 0;
          }

     }
     public static void main(String args[]){
          System.out.println("enter age");

          Scanner sc= new Scanner(System.in);
          int age=sc.nextInt();

          ageForVote(age);


     }
    
}
