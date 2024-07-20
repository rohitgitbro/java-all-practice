// print number from n to 1

public class prtNum1
{
    public static int revNum(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
             return 1;
        }
        System.out.print(n+" ");
        revNum(n-1);
        return 1;

    }
    public static void main(String args[])
    {
        int n;
       revNum(10);
    }
}