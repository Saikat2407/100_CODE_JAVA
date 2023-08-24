package AdvanceQuestion;

import java.util.Arrays;

public class AllnegativeonOneside {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 9, -3, 8, 11, -5};
        shiftall(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void shiftall(int[] arr, int left, int right){

        while (left <= right)
        {

            if (arr[left] < 0 && arr[right] < 0)
                left++;

            else if (arr[left] > 0 && arr[right] < 0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }

            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else
            {
                left++;
                right--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
