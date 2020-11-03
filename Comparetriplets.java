import java.util.*;

public class CompareTriplets
{
    public static void main(String args[])throws InputMismatchException
    {
       Scanner k= new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int i;
        for(i=0;i<3;i++)                                   // Alice Score
        {
            a[i]=k.nextInt();
            
        }

        for(i=0;i<3;i++)                                      //Bob Score
        {
            b[i]=k.nextInt();
        }
        int A=0,B=0;
        for(i=0;i<3;i++)
        {
            if(a[i]>b[i])
            A++;
            else if(a[i]<b[i])
            B++;
        }
        System.out.print(A+" "+B);
       
    }
} 

