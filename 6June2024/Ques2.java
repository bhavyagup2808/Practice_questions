import java.util.ArrayList;

public class Ques2 {
    public static void main(String[] args) {
        ArrayList<Integer>ans=new ArrayList<Integer>();
        int arr[]={1,2,3,7,5,0,3,8,5,10};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(i==0 && arr[i+1]<arr[i])
            {
                ans.add(i);
            }
            else if(i==arr.length-1 && arr[i]>max)
            {
                ans.add(i);

            }
            else if(arr[i]> max && arr[i]>arr[i+1]) 
            {
                ans.add(i);
            }
            max=Math.max(max,arr[i]);
        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}
