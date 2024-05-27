import java.util.Scanner;

public class Ques14 {
    //reverse the string
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("The string to be reversed:");
        String s=obj.nextLine();
        String reverse="";
        for(int i=0;i<s.length();i++)
        {
            reverse=s.charAt(i)+reverse;
        }
        System.out.println("Reverse o fthe string is: "+reverse);
    }
}
