public class Ques10 {
    public static void main(String[] args) {
        //to find third smallest element inthe array
        int[] arr={1,-1,2,4,2,10,7,5,2};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(arr[2]);

    }
}
