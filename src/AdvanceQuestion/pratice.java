package AdvanceQuestion;

import java.util.Arrays;
import java.util.Map;

public class pratice{
    public static void main(String[] args) {
        int[] arr = new int[]{-2, -3, 4, -1, -3};
        int ans = solver(arr);
        System.out.println(ans);
    }

    static int solver(int[] arr){
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i+1; j < n; j++) {
                sum += arr[j];
                res = Math.max(sum,res);
            }
        }
        return res;
    }
}
