// 11	Write an application that creates an array with five Float command line arguments and display the length of the array after creation and its elements.
public class p11   {
    public static void main(String[] args) {
        // create an array with five float command line arguments
        float[] array = new float[5];
        for (int i = 0; i < 5; i++) {
            // parse the arguments as floats and store them in the array
            array[i] = Float.parseFloat(args[i]);
        }
   
        System.out.println("The length of the array is " + array.length);
     
        System.out.println("The elements of the array are:");
        for (float element : array) {
            System.out.println(element);
        }
    }
}
