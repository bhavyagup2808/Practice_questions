import java.util.ArrayList;
import java.util.Scanner;

public class Ques19 {
    //Split the words in the sentence String
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("The String that needs to be splited: ");
        String s=obj.nextLine();
        ArrayList<String> arr=new ArrayList<String>();
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if( s.charAt(i) != ' ')
            {
                temp = temp+s.charAt(i);
            }
            else 
            {
                arr.add(temp);
                temp="";
            }
        }
        arr.add(temp);
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

    }
}
