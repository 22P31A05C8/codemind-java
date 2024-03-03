import java.util.*;
public class StringConcatenation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String r=s1+s2;
        char[] a=r.toCharArray();
        Arrays.sort(a);
       String result=new String(a);
       System.out.print(result);
    }
}