package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArraybyKelement {

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7 };
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
    public static void reverse(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

}
