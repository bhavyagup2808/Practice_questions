
public class Ques1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int d=3;
        for(int i=0;i<d/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[d-1-i];
            arr[d-1-i]=temp;
        }
        
        for(int i=d;i<(d+n)/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1+d-i];
            arr[n-1+d-i]=temp;
        }
        
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
