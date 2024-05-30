public class Ques5 {

    // Write a program in C to print Floyd's Triangle.
    // 1
    // 01
    // 101
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==1)System.out.print(0);
                else System.out.print(1);
            }
            System.out.println();
        }
    }
}
 