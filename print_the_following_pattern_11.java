import java.util.*;
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char start='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(start+" ");
            }
            System.out.println();
            start++;
        }
    }
}