package Array;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearchInRange {
//    static int Rangesolver(int[] arr, int start, int end, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int i = start; i <= end ; i++) {
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static int rage(int[] arr, int start, int end, int target){
        int n = arr.length;

        if(n == 0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr = Array.inputarray.input();
        Scanner sc = new Scanner(System.in);
        int size = 6;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.toString(arr));
        System.out.println(rage(arr,2,size,12));
    }
}
