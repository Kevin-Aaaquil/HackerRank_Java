/*To input a array and its size and print sum...EasyPeasy*/

// Scanner class used

import java.util.*;

class SimpleArraySum
{
    public static void main(String args[]) throws InputMismatchException
    {
        Scanner k= new Scanner(System.in);
        int n=k.nextInt();
        int a[]= new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        {
            a[i]=k.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        k.close();
    }
}
