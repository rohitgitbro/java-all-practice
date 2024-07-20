// check array is sorted or not

public class isSorted
{
    public static boolean isSort(int a[],int si)
    {
        if(si == a.length - 1)
        {
            return true;
        }
        if(a[si] > a[si+1])
        {
            return false;
        }
        return isSort(a,si+1);

    }
    public static void main(String args[])
    {
        int a[] = {1,2,5,4};
        System.out.print(isSort(a,0));
    }
} 