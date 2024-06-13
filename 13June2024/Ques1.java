import java.util.ArrayList;

public class Ques1
{
    public static void main(String[] args) {
        ArrayList<Integer> neg=new ArrayList<Integer>();
        int arr[]={1,2,-1,-2,3,-4,-2,4,5,-1};
        int i=0,j=0;
        int k=0;
        int n=3;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while(j<arr.length)
        {
            if(arr[j]<0)neg.add(arr[j]);
            if(j-i+1 ==n) 
            {
                ans.add(neg.get(k));
                if(arr[i]<0)k++;
                i++;
            }
        }
        for(i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        } 
    }
}