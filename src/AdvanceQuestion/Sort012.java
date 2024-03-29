package AdvanceQuestion;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = new int[]{1 , 0, 0, 2, 1, 2, 1}; // 0,0,1,1,1,2,2
        sort(arr);
    }

    public static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            switch(arr[mid]){
                case 0 : {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(arr, mid, high);
                    high--;
                    mid++;
                    break;
                }
            }
        }
        int n = arr.length;
        for (int i = 0; i < n; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
