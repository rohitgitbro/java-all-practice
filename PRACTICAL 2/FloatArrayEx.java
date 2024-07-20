public class FloatArrayEx {
    public static void main(String[] args) {
        // Create an array to store the float values
        float[] floatArray = new float[5];

        // Parse the command line arguments and store them in the array
        for (int i = 0; i < 5; i++) {
            floatArray[i] = Float.parseFloat(args[i]);
        }

        // Display the length of the array
        System.out.println("Array length: " + floatArray.length);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (float value : floatArray) {
            System.out.println(value);
        }
    }
}
