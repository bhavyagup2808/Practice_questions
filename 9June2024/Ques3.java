public class Ques3 {
    public static void main(String[] args) {
        //find the gcd of two no
        int a=42,b=24;
        while(b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println(a);
    }
}
