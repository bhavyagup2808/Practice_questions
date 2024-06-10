public class Ques3 {
    static int countpath(int n,int i,int j)
    {
        if(i==n-1 && j==n-1) return 1;
        if(i>=n || j>=n)return 0;
        return countpath(n, i+1, j)+countpath(n, i, j+1);

    }
    public static void main(String[] args) {
        int ans= countpath(4,0,0);
        System.out.println(ans);
    }
}
