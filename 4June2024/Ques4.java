public class Ques4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=2;
        k=k%arr.length;
        for(int i=0;i<k;i++)
        {
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
