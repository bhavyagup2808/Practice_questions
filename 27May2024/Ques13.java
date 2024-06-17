
import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("The value of N for the fibonacci series");
        int n=obj.nextInt();
        int[] l1= new int[n];
        l1[0]=0;
        l1[1]=1;
        for(int i=2;i<n;i++)
        {
            l1[i]=(l1[i-1]+l1[i-2]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(l1[i]);
            System.out.print(" ");
        }
    }
    
}
