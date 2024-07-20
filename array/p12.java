
//12	Write a program that creates and initializes a four element byte array. Calculate and display the average of its values.
public class p12 {

        public static void main(String[] args) {
          // create and initialize a four element byte array
          byte[] byteArray = {10, 20, 30, 40};
          // calculate the sum of the array elements
          int sum = 0;
          for (byte b : byteArray) {
            sum += b;
          }
          // calculate the average of the array elements
          double average = (double) sum / byteArray.length;
          // display the average
          System.out.println("The average of the byte array is: " + average);
        }
      }
      

