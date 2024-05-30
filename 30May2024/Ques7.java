import java.util.Scanner;

public class Ques7 {
//     Write a C program to find the sum of an A.P. series.
// Test Data :
// Input the starting number of the A.P. series: 1
// Input the number of items for the A.P. series: 10
// Input the common difference of A.P. series: 4
// Expected Output :
// The Sum of the A.P. series are :
// 1 + 5 + 9 + 13 + 17 + 21 + 25 + 29 + 33 + 37 = 190
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Input the starting number of the A.P. series:");
        int a=obj.nextInt();
        System.out.println("Input the number of items for the A.P. series:");
        int n=obj.nextInt();
        System.out.println("Input the common difference of A.P. series:");
        int d=obj.nextInt();
        int temp=a;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum += temp;
            temp=temp+d;
        }
        System.out.println("The Sum of the A.P. series are :"+ sum);
    }
}
