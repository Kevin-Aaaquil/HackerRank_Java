import java.util.*;
public class ApplesandOranges
{
    public static void main(String args[]) throws InputMismatchException
    {
        
        Scanner sc=new Scanner(System.in);
        int s,t,a,b,m,n,i,countapp=0,countorg=0;
        s=sc.nextInt();               //House 
        t=sc.nextInt();               //House 
        a=sc.nextInt();               //Apple location 
        b=sc.nextInt();               //Orange location   
        m=sc.nextInt();               //Apple Array Length
        n=sc.nextInt();               //Orange Array Length
        int apples[]=new int[m];      //Apple Array Dec   
        int oranges[]=new int[n];     //Orange Array Dec
        for(i=0;i<m;i++)
        apples[i]=sc.nextInt();
        for(i=0;i<n;i++)
        oranges[i]=sc.nextInt();
        for(i=0;i<m;i++)        //Apple Check
        {
            int d=apples[i]+a;
            if(d>=s && d<=t)
            countapp++;
        }
        
        for(i=0;i<n;i++)        //Orange Check
        {
            int d=oranges[i]+b;
            if(d>=s && d<=t)
            countorg++;
        }
        System.out.println(countapp);
        System.out.println(countorg);     
        sc.close();         
        
    }
}
