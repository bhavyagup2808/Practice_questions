
import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("The string :");
        String s=obj.nextLine();
        int[] arr=new int[26];
        for(int i=0;i<26;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            int x='a';
            System.out.println((char)(x+i)+"->"+arr[i]);
        }


    }
}
