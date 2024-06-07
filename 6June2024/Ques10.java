public class Ques10 {
    public static void main(String[] args) {
        int target=5;
        boolean flag=false;
        //2d matrix searching
        int arr[][]={{1,2,3,4},{5,6,7,8}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;i++)
            {
                if(arr[i][j]==target)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)break;
        }
        if(flag==true) System.out.println("Target is found");
        else System.out.println("Target is not found");

    }
}
