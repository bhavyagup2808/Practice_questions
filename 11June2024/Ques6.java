public class Ques6 {
    public static void main(String[] args) {
        
        int [] arr={2,3,-3,-3,-1,2};
        int maxi=0;
        for(int i=0;i<arr.length;i++)
        {
            int prod=1;
            for(int j=i;j<arr.length;j++)
            {
                prod *=arr[j];
                maxi=Math.max(maxi,prod);
            }


        }
        System.out.println(maxi);
    }
}
