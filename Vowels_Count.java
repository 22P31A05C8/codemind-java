import java.util.Scanner;
public class Lucky
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String v="aeiouAEIOU";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
         if(v.contains(""+s.charAt(i)))
         {
             count++;
         }
        }
        System.out.print(count);
    }
}