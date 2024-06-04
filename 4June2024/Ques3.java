import java.util.ArrayList;
class Ques3 {
    public static void main(String[] args) {
        int arr[]={-1,-1,0,5,1,2,3,4,5,5,5,6,6};
        ArrayList<Integer> temp=new ArrayList<Integer>();
        temp.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j]) flag=true;
            }
            if(flag==false)temp.add(arr[i]);
        }
        for(int i=0;i<temp.size();i++)
        {
            System.out.print(temp.get(i)+" ");
        }
    }
}