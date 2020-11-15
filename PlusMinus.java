import java.util.*;

public class PlusMinus
{
    public static void main(String args[])throws InputMismatchException
    {
        Scanner k= new Scanner(System.in);
        int l=k.nextInt();
        int a[]=new int[l];
        int i;
        double p=0.0,z=0.0,n=0.0;
        for(i=0;i<l;i++)
        {a[i]=k.nextInt();}
        for(i=0;i<l;i++)
        {
            if(a[i]<0)
            n++;
            else if(a[i]>0)
            p++;
            else
            z++;
            
        }
        System.out.println(p/l);
        System.out.println(n/l);
        System.out.println(z/l);
        k.close();
    }
}
