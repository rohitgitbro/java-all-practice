import java.util.*;  
// largest number in array

public class ArraysCC
{
    public static int getLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;//+infinity

        for(int i=0; i<numbers.length; i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest numbers in arrays is :"+smallest);
        return largest;
        //return smallest; return ek j value thai etla mate error aavi
    }
        

  public static void main(String args[])
  {
    int numbers[] = {2, 4, 8, 5, 3};
    System.out.println(": "+getLargest(numbers));

  }

}