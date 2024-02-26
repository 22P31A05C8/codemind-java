import java.util.Scanner;
public class MA{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        for(int k=0;k<r2;k++)
        for(int l=0;l<c2;l++)
        {
            arr2[k][l]=sc.nextInt();
        }
        int[][] arr=new int[r1][c2];
        for(int m=0;m<r1;m++){
        for(int n=0;n<c2;n++)
        {
            arr[m][n]=arr1[m][n]+arr2[m][n];
        }}
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++){
        System.out.print(arr[i][j]+" ");
       }
       System.out.println();
        }
}
}