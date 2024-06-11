public class Ques9 {
    public static void main(String[] args) {
        int arr[]={-5,-2,5,2,4,7,1,8,0,-8};
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<0)
            {
                int temp=arr[i];
                arr[j]=arr[i];
                arr[i]=temp;
                i=i+2;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
