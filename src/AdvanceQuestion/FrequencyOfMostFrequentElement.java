package AdvanceQuestion;

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {
    public static void main(String[] args) {
        int[] nums = {3,9,6};
        int ans = maxFrequency(nums, 2);
        System.out.println(ans);
    }

    static int maxFrequency(int[] nums, int k){
        int left = 0, right = 0, ans = 0;

        Arrays.sort(nums);

        long sum = nums[0];
        int gratest_element = nums[0];

        while (right < nums.length){
            if(gratest_element * (right-left+1) < sum + k){
                ans = Math.max(ans, right-left+1);
                right++;
                if(right<nums.length) sum += nums[right];
            }
            else {
                sum -= nums[left];
                left++;
            }
        }
        return ans;
    }

}
