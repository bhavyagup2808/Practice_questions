public class Ques3 {
    public static void main(String[] args) {
        String s="abacaba";
        int j=1,i=0;
        int ans=1;
        while(j<s.length())
        {
            if(s.charAt(j)-s.charAt(j-1)==1)
            {
                ans=Math.max(j-i+1,ans);
            }
            else i=j;
            j++;
        }
        System.out.println("The longest substring is "+ ans); 
    }
}
