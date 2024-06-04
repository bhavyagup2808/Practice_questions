public class Ques1 {
    public static void main(String[] args) {
        int arr1[]={1,2,5,4,0};
        int arr2[]={1,2,5,4,0};
        boolean flag=true;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] != arr2[i])
            {
                flag=false;
                break;
            }
        }
        if(flag==true) System.out.println("The two array are equal");
        else System.out.println("Two array are not equal");

    }
}
