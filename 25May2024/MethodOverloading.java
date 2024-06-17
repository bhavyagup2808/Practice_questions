class Sum
{
    static int sum (int x,int y)
    {
        return x+y;
    } 
    static double sum (double x , double y)
    {
        return x+y;
    }
    static int sum(int arr[])
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp +=arr[i];
        }
        return temp;
    }
    static double sum(double arr[])
    {
        double temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp +=arr[i];
        }
        return temp;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        double arr2[]={1,2,3,4,5};
        System.out.println("The sum of 3 and 5 is "+Sum.sum(3,5));
        System.out.println("The sum of 3.0 and 5.0 is "+Sum.sum(3.0,5.0));
        System.out.println("The sum of arr1 is "+Sum.sum(arr1));
        System.out.println("The sum of arr2 is "+Sum.sum(arr2));
    }
}
