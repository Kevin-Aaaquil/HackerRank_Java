import java.util.*;
public class Staircase
{
    public static void main(String args[])throws InputMismatchException
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(k=n-i;k>0;k--)
            {System.out.print(" ");}
            for(j=1;j<=i;j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
