public class Ques3 {
    public static void main(String[] args) {
        String[] arr = {"Muskan", "Suneha", "Bhavya", "Teshni", "Tejal"};
        String temp;
        for (int i = 0; i<arr.length-1 ; i++){
            for(int j = i+1; j<arr.length ; j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        for(String i:arr){
            System.out.println(i);
        }
    }
}
