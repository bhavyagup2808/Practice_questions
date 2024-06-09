public class Ques1 {
    public static void main(String[] args) {
        // Multiplication of matrix
        int arr1[][]={{1,2,3},{1,2,3},{1,2,3}};
        int arr2[][]={{1,2,3},{1,2,3},{1,2,3}};
        int ans[][]=new int[3][3];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2[0].length;j++)
            {
                for(int k=0;k<arr1.length;k++)
                {
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
        }

    }
}
