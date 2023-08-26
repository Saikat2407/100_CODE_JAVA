package AdvanceQuestion;

import java.util.Arrays;
//if the array is not sorted first sort it and then solve it
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {5,4,6,9};
        int[] arr2 = {0,1,3,2,7};
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        merge(arr1,arr2,n,m);
        for (int i = 0; i < n; i++) System.out.print(arr1[i] + " ");
        System.out.println();
        for (int j = 0; j < m; j++) {
            System.out.print(arr2[j] + " ");
        }
    }

    static void merge(int[] arr1, int[] arr2, int n, int m){
        int[] arr3 = new int[n+m];

        int left = 0;
        int right = 0;
        int index = 0;
        while(left < n && right < m){
            if(arr1[left] <= arr2[right]){
                arr3[index] = arr1[left];
                left++;
                index++;
            }
            else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }
        while (left < n){
            arr3[index++] = arr1[left++];
        }
        while (right < m){
            arr3[index++] = arr2[right++];
        }
        for (int i = 0; i < arr3.length; i++) {
            if(i < n){
                arr1[i] = arr3[i];
            }else arr2[i-n] = arr3[i];
        }
    }
}
