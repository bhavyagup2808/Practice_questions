public class Ques2 {
    static int boardgame(int n)
    {
        if(n<0)return 0;
        if(n==0) return 1;
        return boardgame(n-1)+boardgame(n-2)+boardgame(n-3)+boardgame(n-4)+boardgame(n-5)+boardgame(n-6);
    }
    public static void main(String[] args) {
        int ans=boardgame(3);
        System.out.println(ans);
    }
}
