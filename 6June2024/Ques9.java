public class Ques9 {
    //Maximum circular subarray sum
    //Wrapsum=totalsum-non wrapsum
    public static void main(String[] args) {
        int arr[]={-1,2,3,5,6,-3,6,-12,43};
        int max=0;
        int temp=0;
        int totalSum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalSum +=arr[i];
            temp=temp-arr[i];
            if(temp<0)
            {
                temp=0;
            }
            else{
                max=Math.max(max,temp);
            }
        }
        System.out.println(totalSum-max);
 
    }
}
