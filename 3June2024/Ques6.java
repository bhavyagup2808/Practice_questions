
class Solution {
    public static void main(String[] args) {
       int arr[]={1,2,2,3,4,5,6,6,8};
       boolean ans=false;
       for(int i=0;i<arr.length-1;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]==arr[j])
               {
                   System.out.println(arr[i]);
                   ans=true;
                   break;
               }
           }
           if(ans==true)break;
       }
    }
}
