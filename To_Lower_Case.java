import java.util.Scanner;
public class Main
{
    static String ToLowerCase(String source)
    {
        String ss=source.toLowerCase();
        return ss;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(ToLowerCase(s));
    }
}