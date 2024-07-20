/*
 * Write a program that creates and initializes a four element byte array. Calculate and display the average of its values.
 */

public class pr_12 {
    public static void main(String args[]){
        byte byteArray[] = new byte[4];

        //initialize the byte array with values
        byteArray[0] = 10;
        byteArray[1] = 20;
        byteArray[2] = 30;
        byteArray[3] = 40;

    // calculate the avg of byte array values
    int sum = 0;
    for(int i=0; i<byteArray.length; i++){
        sum+=byteArray[i];
    }
    double avg = (double)sum / byteArray.length;
    
    System.out.println("the avg is :"+avg);


    }
    
}
