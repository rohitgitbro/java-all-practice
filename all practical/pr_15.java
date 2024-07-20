public class pr_15 {
    public static void main(String[] args) {
        String str1=new String("Hello Worldzxa");
        String str2= new  String("Hello World");
        if(str1.equals(str2)) {
            System.out.println("String are the same");

            str1 = str1.concat(str2);
            System.out.println("New String: " + str1);
        }
        else
            System.out.println("String are different");
    }
}
