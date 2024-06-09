package 9June2024;

public class Ques2 {
    //Search in the array whose col and rows are sorted
    public static void main(String[] args) {
        int target=10;
        int arr[][]={{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        int i=0,j=arr[0].length-1;
        boolean flag=false;
        while(i<arr.length && j>=0)
        {
            if(arr[i][j]==target)
            {
                flag=true;
                break;
            }
            else if( arr[i][j]>target)i++;
            else j--;
        }
        if(flag==true) System.out.println("The taget is found");
        else System.out.println("The target is not found ");
    }
}
