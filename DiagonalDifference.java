// To Input a variable Square Matrix and display absolute difference between the two diaognals
import java.util.*;

public class DiagonalDifference
{
    public static void main(String args[])throws InputMismatchException
    {
        Scanner k= new Scanner(System.in);
        int n= k.nextInt();
        int ar[][]=new int[n][n];
        int i,j;
        int sumdr=0,sumdl=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][j]=k.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                sumdl=sumdl+ar[i][j];
                
                if(i+j==n-1)
                sumdr=sumdr+ar[i][j];
            }
        }
        System.out.print(Math.abs(sumdl-sumdr));
    }
}
