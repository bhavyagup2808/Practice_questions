import java.util.Scanner;

public class Ques6 {
//     Write a program in C to find the prime numbers within a range of numbers.
// Test Data :
// Input starting number of range: 1
// Input ending number of range : 50
// Expected Output :
// The prime number between 1 and 50 are :
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Input starting number of range");
        int x= obj.nextInt();
        System.out.println("Input ending number of range");
        int y= obj.nextInt();

        boolean [] arr =new boolean[y+1];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<=y;i++)
        {
            if(arr[i]== false)
            {
                for(int j=(int)Math.pow(i,2);j<=y;j=j+i)
                {
                    arr[j]=true;
                }
            }
        }
        for(int i=x;i<=y;i++)
        {
            if(arr[i]==false) System.out.print(i+" ");
        }



    }
}
