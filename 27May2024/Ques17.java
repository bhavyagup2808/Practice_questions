import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("The number to be reversed: ");
        int n=obj.nextInt();
        int reverse=0;
        while(n !=0)
        {
            reverse = (reverse*10)+(n%10);
            n /=10;
        }
        System.out.println("The reverse number is:  "+reverse);
    }
}
