public class Ques6 {
    static int fact(int n,int x)
    {
        int ans =1;
        for(int i=x;i<=n;i++)
        {
            ans *=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int x=fact(r,1);
        int y=fact(n,n-r+1);
        System.out.println("The value of 5c2 is "+ y/x);

    } 
}
