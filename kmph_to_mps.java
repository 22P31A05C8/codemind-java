import java.util.Scanner;
public class kmp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float kmph=sc.nextInt();
        double mps=kmph*0.277777778;
        System.out.printf("%.2f",mps);
    }
}