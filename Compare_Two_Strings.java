import java.util.Scanner;
public class Strings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
         if(s.equals(s2))
         {
             System.out.print("Strings are Equal");
         }
        else
        System.out.print("Strings are not Equal");
 
    }
}