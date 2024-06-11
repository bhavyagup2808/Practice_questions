public class Ques2 {
    public static void main(String[] args) {
        int[] a={4,2,3,5,6};
        int[] b={1,2,4,5,6};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++)
        {
            sum1 +=a[i];
    
        }
        for(int i=0;i<b.length;i++)
        {
            sum2 +=b[i];
        }
        boolean flag =false;
        for(int i=0;i<a.length;i++ )
        {
            for(int j=0;j<b.length;j++)
            {
                if(sum1-a[i]+b[j]==sum2-b[j]+a[i])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)break;
        }
        if(flag==true) System.out.println("The pair found");
        else System.out.println("The Pair not found");
     }
}
