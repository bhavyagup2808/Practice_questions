public class Ques8 {
    public static void main(String[] args) {
        int arr[]={-1,2,3,5,6,-3,6,-12,43};
        int max=0;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp=temp+arr[i];
            if(temp<0)
            {
                temp=0;
            }
            else{
                max=Math.max(max,temp);
            }
        }
        System.out.println(max);

    }
}
