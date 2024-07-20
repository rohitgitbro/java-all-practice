public class pr1  {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide four integer command line arguments.");
        } else {
            try {
                // Convert command line arguments to integers
                int[] numbers = new int[4];
                for (int i = 0; i < 4; i++) {
                    numbers[i] = Integer.parseInt(args[i]);
                }

                // Calculate and display the average
                double average = calculateAverage(numbers);
                System.out.println("The average of the numbers is: " + average);

            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide valid integer arguments.");
            }
        }
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
