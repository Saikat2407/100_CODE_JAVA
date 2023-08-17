package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountFrequencyInArray {
    public static void main(String[] args) {
        int arr[] = {10 , 11, 80, 100, 100, 30, 10};
        int n = arr.length;
        countfrequency(arr,n);
    }

    static void countfrequency(int[] arr, int n){
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int count = 1;

            while ( i < n-1 && arr[i] == arr[i+1]){
                i++;
                count += 1;
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
