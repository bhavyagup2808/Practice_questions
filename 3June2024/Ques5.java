import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,8};
       int target=9;
       boolean ans=false;
       int i=0,j=arr.length-1;
       while(i<j)
       {
           if(arr[i]+arr[j]==target)
           {
               ans=true;
               break;
           }
           else if(arr[i]+arr[j]>target)
           {
               j--;
           }
           else
           {
               i++;
           }
           
       }
       if(ans==true) System.out.println(arr[i]+" "+arr[j]);
       else System.out.println("There is no target sum")
    }
}