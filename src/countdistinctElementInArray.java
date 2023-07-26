import java.util.Arrays;

public class countdistinctElementInArray {

    public static void main(String[] args) {
        int[] arr = inputarray.input();
        countunique(arr, arr.length);
    }

    static void countunique(int[] arr, int n){
//        n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i] + " " + "Duplicate");
                }
            }

        }
    }

}
