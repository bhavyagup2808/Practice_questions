public class Ques8 {
    static int solve(int n)
    {
        if(n==1)return 1;
        if(n==2) return 2;
        int start= 1;
        int end = 2;
        int temp=0;
        for (int i = 3; i <= n; i++) {
            temp = start + end;
            start=end;
            end=temp;
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println("The no of ways to climb stairs is "+ solve(5));
    }
}
