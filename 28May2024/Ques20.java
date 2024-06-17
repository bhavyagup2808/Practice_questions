class Solution
{
    static int equalSubstring(String s, String t, int maxCost) {
        int sum=0;
        int i=0,j=0;
        int ans=0;
        while(j<s.length())
        {
            sum +=Math.abs(s.charAt(j)-t.charAt(j));
            if(sum<=maxCost)
            {
                ans=Math.max(ans,j-i+1);
            }
            else
            {
                while(sum>maxCost)
                {
                    sum -= Math.abs(s.charAt(i)-t.charAt(i));
                    i++;
                }

            }
            j++;
        }
        return ans;
    }
}

public class Ques20 {
// You are given two strings s and t of the same length and an integer maxCost.

// You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).

// Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no 
// substring from s that can be changed to its corresponding substring from t, return 0.
    public static void main(String[] args) {
        System.out.println("The ans is: "+ Solution.equalSubstring("abcd", "bcdf", 3));
    }
}
