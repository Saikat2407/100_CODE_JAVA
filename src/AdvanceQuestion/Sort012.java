package AdvanceQuestion;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = new int[]{1 , 0, 0, 2, 1, 2, 1};
        sort(arr);
    }

    static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        int temp;

        while (mid <= high){
            switch (arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
