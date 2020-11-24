import java.util.*;

public class MinMax
{
    public static void main(String args[])throws InputMismatchException
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i,max,min; long sum;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0]; min=a[0]; sum=a[0];
        for(i=1;i<5;i++)
        {
            max=(a[i]>max)? a[i]:max;
            min=(a[i]<min)? a[i]:min;
            sum=sum+a[i];
        }
        System.out.println((sum-max)+" "+(sum-min)); 
        sc.close();
    }
}
