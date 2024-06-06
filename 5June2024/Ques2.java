public class Ques2 {
    public static void main(String[] args) {
        String s="aaaabbbbbccccccccccca";
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i] !=0)ans +=Integer.toString(arr[i])+(char)(i+'a');
        }
        System.out.println("The concetination of the string is : "+ans);
    }
}
