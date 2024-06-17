import java.util.Scanner;

class Solution
{
    static int factorial(int n)
    {
        if (n==1)return 1;
        return n*factorial(n-1);
    }
}
public class Ques18{
    //Factorial
        public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("The value for which factorial is to be found: ");
        int n =obj.nextInt();
        System.out.println("Factorial of "+n+" is : "+Solution.factorial(n));
    }
}