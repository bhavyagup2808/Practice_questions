import java.util.Scanner;

class Solution{
    static String reverse(String s)
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            temp=s.charAt(i)+temp;
        }
        return temp;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to reverse it");
        String s= sc.nextLine();
        String [] arr=s.split(" ");
        String ans= Solution.reverse(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            ans= ans+" "+Solution.reverse(arr[i]);
        }
        System.out.println(ans);
    }
}
