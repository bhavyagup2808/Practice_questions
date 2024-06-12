
public class Ques1 {
    public static void main(String[] args) {
        int[] nums={0,0,1,2,0,1,2,1,0,2,2};
        int start=0;
        int end=nums.length-1;
        int j=0;
        while(j<=end)
        {
            if(nums[j]==0)
            {
                int temp=nums[j];
                nums[j]=nums[start];
                nums[start]=temp;
                start++;
                j++;
            }
            else if(nums[j]==2)
            {
                int temp=nums[j];
                nums[j]=nums[end];
                nums[end]=temp;
                end--;
            }
            else j++;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
