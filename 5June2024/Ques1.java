public class Ques1{
    // Choclate Wrapper problem
    public static void main(String[] args) {
        int money=15;
        int wrapper=2;
        int choc=money;
        int temp=choc;
        while(temp>wrapper)
        {
            int x=temp/wrapper;
            choc+= temp/wrapper;
            temp +=(temp%2)+x;
        }
        System.out.println("The no of choclate purchased is "+choc);
    }
}