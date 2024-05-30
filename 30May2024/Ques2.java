class Solution{
    static boolean binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean ans=false;
        while(start<=end)
        {
            int mid=end+(start-end)/2;
            if(arr[mid]== target)return true;
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return ans;
    }
}

public class Ques2 {
    //Binary Search
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Solution.binarySearch(arr, 8));
    }
}
