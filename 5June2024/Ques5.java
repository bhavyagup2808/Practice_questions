
public class Ques5 {
    public static void main(String[] args) {
        int arr[]={1,3,5,5,66,4,43,4,5,7};
        int target=4;
        int mini=arr.length;
        int temp=0;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            temp +=arr[i];
            if(temp==target)
            {
                mini=Math.max(mini,i-j+1);
            }
            else if(temp>target)
            {
                while(temp>target)
                {
                    temp -=arr[j++];
                }
                if(temp==target)
                {
                    mini=Math.max(mini,i-j+1);
                }
            }
        }
        System.out.println(mini);
    }
    
    
}
