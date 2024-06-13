import java.util.HashSet;

public class Ques6 {
    static void longestKSubstring(String s, int k)
    {
 
        int n = s.length();
        int answer = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                HashSet<Character> distinct= new HashSet<Character>();
                for (int x = i; x < j; x++) {
                    distinct.add(s.charAt(x));
                }
                if (distinct.size() == k) {
                    answer = Math.max(answer, j - i);
                }
            }
        }
 
        System.out.println(answer);
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
 
        // Function Call
        longestKSubstring(s, k);
    }
}
