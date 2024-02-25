import java.util.Scanner;
public class PrettyNums
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int count=0;
            for(int i=l;i<=r;i++)
            {
                String last=Integer.toString(i);
                char lastt=last.charAt(last.length()-1);
                if(lastt=='2'||lastt=='3'||lastt=='9')
                    count++;
            }
            System.out.println(count);
        }
    }
}