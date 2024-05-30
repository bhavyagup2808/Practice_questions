class Solution{
    static String toBinary(int n )
    {
        String temp="";
        while(n>0)
        {
            temp = (n%2)+temp;
            n=n/2;

        }
        return temp;
    }
}
public class Ques1{
    public static void main(String[] args) {
        //Convert decimal no to binary
        System.out.println(Solution.toBinary(20));
    }
}