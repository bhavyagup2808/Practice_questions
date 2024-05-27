class Solution{
    static void Armstrong(int n)
    {
        int temp=n;
        int sum=0;
        while(temp !=0)
        {
            int x=temp%10;
            temp/=10;
            sum += Math.pow(x, 3);
        }
        if(sum==n) System.out.println("The number is armstrong Number");
        else System.out.println("The number is not armstrong Number");

    }
}


public class Ques11 {
    //armstrong number
    public static void main(String[] args) {
        Solution.Armstrong(15);
        
    }
}