public class Ques3 {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,5,7,9,10,5};
        int k=3;
        for(int i=0;i<arr.length-k+1;i++)
        {
            int max=arr[i];
            for(int j=i+1;j<i+k;j++)
            {
                max=Math.max(max,arr[j]);
            }
            System.out.println(max+" ");
        }
    }
}
