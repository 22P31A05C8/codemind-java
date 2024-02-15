import java.util.Scanner;
public class StringPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean c=true;
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            c=false;
            break;
        }
        System.out.print(c?"Palindrome":"Not Palindrome");
    }
}