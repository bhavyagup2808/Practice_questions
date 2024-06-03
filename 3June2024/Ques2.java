// append-characters-to-string-to-make-subsequence

public class Ques2 {
    public static void main(String[] args) {
        String s="coaching";
        String t="coding";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if (j == t.length()) {
                break;
            }
            if(s.charAt(i) == t.charAt(j))j++;
        }
        System.out.println("The no of letters to be added at last is "+ (t.length()-j));
    }
}
