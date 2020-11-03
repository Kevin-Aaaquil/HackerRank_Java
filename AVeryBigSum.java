//Calculate sum of very big integers


import java.util.*;

public class AVeryBigSum
{
    public static void main(String args[])throws InputMismatchException
    {
        Scanner k= new Scanner(System.in);
        int n=k.nextInt();
        long ar[]=new long[n];
        int i; long sum=0;
        for(i=0;i<n;i++)
        {
            ar[i]=k.nextInt();                     
        }
        for(i=0;i<n;i++)
        {sum=sum+ar[i];}
        System.out.println(sum);
        k.close();
    }
}
