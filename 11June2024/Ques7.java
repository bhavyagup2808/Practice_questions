
public class Ques7 {
    public static void main(String[] args) {
        //program to remove duplicate characters from the given string
        String str="the quick brown fox";
        String s="queen";
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(s.contains(Character.toString(str.charAt(i)))==false) ans=ans+str.charAt(i);
        }
        System.out.println(ans);
    }
}
