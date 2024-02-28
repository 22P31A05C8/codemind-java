import java.util.Scanner;
public class Odd
{
    static int IsOdd(int a)
    {
        if(a%2!=0) return 2;
        else return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sa=sc.nextInt();
        System.out.println(IsOdd(sa));
    }
}