public class Ques1 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{1,2,4,6,8},{10,11,2,5,7}};
        int row_start=0;
        int row_end=arr.length;
        int col_start=0;
        int col_end=arr[0].length;
        while(row_start <row_end && col_start<col_end)
        {
            for(int i=col_start;i<col_end;i++)
            {
                System.out.print(arr[row_start][i]+" ");
            }
            row_start++;
            for(int i=row_start;i<row_end;i++)
            {
                System.out.print(arr[i][col_end-1]+" ");
            }
            col_end--;
            for(int i=col_end-1;row_start <row_end && i>=col_start;i--)
            {
                System.out.print(arr[row_end-1][i]+" ");
            }
            row_end--;
            for(int i=row_end; col_start<col_end && i>=row_start;i--)
            {
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    }
}
