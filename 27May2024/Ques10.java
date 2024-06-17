class Solution{
    static void Palandrome(String s)
    {
        int n=s.length();

        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i) != s.charAt(n-1-i)){
                System.out.println("The string is not palandrome");
                return;
                //ans=false;
            }
        }
        System.out.println("The string is palandrome");
        return;
    }
}

public class Ques10 {
    //Palandrome of the String 
    public static void main(String[] args) {
        Solution.Palandrome("manan");
    }

}
