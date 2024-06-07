import java.util.ArrayList;
public class Ques7 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = i; j < arr.length; j++) {
                temp.add(arr[j]);
                ans.add(new ArrayList<Integer>(temp));
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
