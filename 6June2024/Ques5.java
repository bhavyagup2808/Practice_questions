
public class Ques5 {
    public static void main(String[] args) {
        int i=0,j=0;
        int arr[]={1,3,5,4,6,9,3,4,9,1};
        int sum=0;
        int target=14;
        while(j<arr.length)
        {
            sum +=arr[j];
            if(sum==target)
            {
                break;
            }
            else if (sum>target)
            {
                while(sum>target)
                {
                    sum -= arr[i++];
                }
            }
            j++;
        }
        if(j==arr.length) System.out.println("The target sum is not found");
        else System.out.println(i+" "+j);

    }
}