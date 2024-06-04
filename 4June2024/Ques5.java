
public class Ques5 {
    public static void main(String[] args) {
        boolean flag=true;
        String s="shjwsxnxobtfgtsvAbqtqyiewpytvvzjklzxcvbnm";
        s=s.toLowerCase();
        for(int i=0;i<26;i++)
        {
            char temp=(char)('a'+i);
            String t=Character.toString(temp);
            if(s.contains(t)==false)
            {
                flag=false;
                break;
            }
        }
        if(flag==false) System.out.println("The string is Pangram");
        else System.out.println("String is not a Pangram");
    }
    
}
