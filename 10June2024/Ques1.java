public class Ques1 {
    static void permutation(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String ros= s.substring(0, i)+s.substring(i+1);
            permutation(ros, ans+c);
        }
    }
    public static void main(String[] args) {
        permutation("ASDF","");
    }
}
