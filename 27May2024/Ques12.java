class Solution{
    static void isPrime(int n)
    {
        Boolean ans=true;
        if(n==1) ans=false;
        else if(n==2 || n==3) ans=true;
        else if(n%2==0 || n%3==0) ans=false;
        for(int i=5;i<Math.sqrt(n);i=i+2)
        {
            if(n%i==0) ans=false;
        }
        if(ans) System.out.println("The no is a Prime No.");
        else System.out.println("The no is not a Prime No.");
    }
}


public class Ques12 {
    public static void main(String[] args) {
        Solution.isPrime(10);
        Solution.isPrime(5);
    }
}
