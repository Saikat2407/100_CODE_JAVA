package AdvanceQuestion;

import java.util.Arrays;
import java.util.Collections;

public class KthsmallestORlargest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{12, 3, 5, 7, 19};
        int k = 2;
        System.out.println(kthsmallest(arr,k));
        System.out.println(kthlargest(arr,k));
    }

    static int kthsmallest(Integer[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    static int kthlargest(Integer[] arr , int k){
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[k-1];
    }
}
