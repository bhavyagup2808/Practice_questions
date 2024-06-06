public class Ques4 {
    public static void main(String[] args) {
        int arr[]={1,54,56,34,63,64,64};
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
    }
}
