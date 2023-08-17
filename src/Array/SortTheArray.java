package Array;

import java.util.Arrays;

public class SortTheArray {
    public static void main(String[] args) {
        int[] arr = { 10, 50, 5, 1, 100};
        int n = arr.length;
        int temp;

//        int[] ans = Arrays.stream(arr).sorted().toArray();
//
//        System.out.println(Arrays.toString(ans));

        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j <= n-1; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
