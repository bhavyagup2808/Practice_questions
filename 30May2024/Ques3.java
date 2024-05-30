public class Ques3 {
    //Pattern Questions
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=((2*n));j++)
            {
                if(j> n-i && j<= n+i)
                {
                    if((j+i)%2==1) System.out.print("*");
                    else System.out.print(" ");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}