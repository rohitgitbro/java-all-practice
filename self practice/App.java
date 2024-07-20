import java.util.Random;

public class numberPlate {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Name: " + "Avinash Bhaliya");
        System.out.println("Enrollment Number: " + "210210107066");
        System.out.println("Date: " + new java.util.Date());
        System.out.println("Practical: 2(4)");
        System.out.println("====================================");

        // Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i <= 10; i++) {
            char c1 = (char) (r.nextInt(26) + 'A');
            char c2 = (char) (r.nextInt(26) + 'A');
            char c3 = (char) (r.nextInt(26) + 'A');
            int x = r.nextInt(9999);
            System.out.println(c1 + "" + c2 + "" + c3 + "-" + x);
        }

    }
}