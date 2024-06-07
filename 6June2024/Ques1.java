public class Ques1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9};
        int maxi=0;
        int count=2;
        int d=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==d)count++;
            else{
                maxi=Math.max(maxi,count);
                count=1;
                d=arr[i+1]-arr[i];
            }
        }
        if(count>maxi)maxi=count;
        System.out.println("The maximum length of the arthmetic array is:" + maxi);       
    }
}
