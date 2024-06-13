public class Ques4 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,1,0,4,6,8,7};
        int i=0,j=0;
        int target=15;
        int sum=0;
        int max=0;
        while(j<arr.length)
        {
            sum +=arr[j];
            if(sum== target)max=Math.max(max,j-i+1);
            else if(sum>target){
                while(sum>target)
                {
                    sum -=arr[i++];
                }
                if(sum== target) max=Math.max(max,j-i+1);
            }
            j++;
        }
        System.out.println(max);
    }
}
