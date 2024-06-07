public class Ques4 {
    public static void main(String[] args) {
        int arr[]={0,5, 8, 3, 5, 9, 2, 8, 6, 3, 1, 4, 7, 6, 2, 9};
        int temp[]=new int[arr.length];
        int ans=arr.length+1;
        for(int i=1;i<=arr.length;i++)
        {
            if(temp[arr[i-1]]==0)
            {
                temp[arr[i-1]]=i;
            }
            else
            {
                if(temp[arr[i-1]]<ans) ans=temp[arr[i-1]];
            }
        }
        System.out.println(ans);

    }
}
