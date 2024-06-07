public class Ques6 {
    public static void main(String[] args) {
        //smallest missing positive no.
        int arr[]={1,2,4,-1,3,6,-2,2,4,0,-3};
        boolean temp[]= new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                temp[arr[i]]=true;
            }
        }
        int ans=0;
        for(int i=1;i<temp.length;i++)
        {
            if(temp[i]==false)
            {
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
