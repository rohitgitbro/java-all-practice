public class pr_23 {
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("good");
            System.out.println("The original string is: " + sb);
            sb.append(" morning");
            System.out.println("The modified string is: " + sb);
            sb.reverse();
            System.out.println("The reversed string is: " + sb);
        }
    }


