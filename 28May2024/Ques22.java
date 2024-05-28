class Solution
{
    static char maximumOccurance(String s)
    {
        int[] arr=new int[26];
        for(int i=0;i<26;i++)
        {
            arr[i]=0;
        }
        int maxi=0;
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']>arr[maxi])
            {
                maxi=s.charAt(i)-'a';
            }
        }
        char temp= (char)(maxi+'a');
        return temp;
    }
}


public class Ques22 {

    public static void main(String[] args) {
        //Maximun occuring character
        Solution.maximumOccurance("bhavyagupta")
    }
}
