public class Ques5 {
    static int lenOfLongSubarr(int[] arr, int N, int k){
    int maxlength = 0;

    for (int i = 0; i < N; i++) {

      int Sum = 0;
      if( maxlength == N - i )
        break;
      
      for (int j = i; j < N; j++) {
        Sum += arr[j];
        if (Sum == k) {
          maxlength = Math.max(maxlength, j - i + 1);
        }
      }
    }

    // Return the maximum length
    return maxlength;
} 
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k = 15;
        System.out.println(lenOfLongSubarr(arr, n, k));
    }
}
