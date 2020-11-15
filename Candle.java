import java.util.*;
public class Candle
{
    public static void main(String args[]) throws InputMismatchException
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(i=1;i<n;i++)
        {
            max=(a[i]>max)? a[i]:max;
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==max)
            c++;
        }
        System.out.println(c);
        sc.close();
                
    }
}
