class PetersonNumber
{
    static int factorial(int n)
    {
        int product=1;
        for(int i=1;i<=n;i++)
        {
            product *=i;
        }
        return product;
    }
    static boolean solution(int n)
    {
        int x=n;
        int sum=0;
        while(n>0)
        {
            int temp=n%10;
            sum += factorial(temp);
            n /=10;
        }
        if(x==sum) return true;
        return false;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        System.out.println(PetersonNumber.solution(145) ? "PetersonNumber" : "Not PetersonNumber");
    }
}
