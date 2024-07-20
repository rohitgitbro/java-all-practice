    import java.util.Scanner;




class maxage extends Exception { @Override
public String toString() {
return "age is maximum to 125 year";
}
 
@Override
public String getMessage() {
return "make sure age enter correct age";
}
}

public class pr_33 {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); int age = sc.nextInt();
if (age > 125) { try {
throw new maxage();
} catch (Exception e1) { System.out.println(e1.toString()); System.out.println(e1.getMessage()); System.out.println(e1); e1.printStackTrace(); System.out.println("work is finish");
}
}
}
}

    

