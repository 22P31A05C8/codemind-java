import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            int count=0;
            for(int i=2;i<=c;i++)
            {
                if(c%i==0)
                count++;
            }
            if(count>1)
            System.out.println("Satya");
            else System.out.println("tevitt");
        }
    }
}