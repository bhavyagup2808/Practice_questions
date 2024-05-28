class Solution 
{
    static String compressedString(String word) {
        int[] arr=new int[26];
        for(int i=0;i<26;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<word.length();i++)
        {
            arr[word.charAt(i)-'a']++;
        }
        String temp="";
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            {
                char t= (char)(i+'a');
                temp =temp+arr[i]+t;
            }
        }
        return temp;
    }
}
public class Ques21 {
    public static void main(String[] args) {
        // Given a string word, compress it using the following algorithm:
        // Begin with an empty string comp. While word is not empty, use the following operation:
        // Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
        // Append the length of the prefix followed by c to comp.
        // Return the string comp
        System.out.println(Solution.compressedString("abcde"));

    }
}
