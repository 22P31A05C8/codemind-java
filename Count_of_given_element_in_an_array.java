import java.util.*;
public class CountElems
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int se=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==se)
            c++;
        }
        System.out.println(c);
        
    }
}