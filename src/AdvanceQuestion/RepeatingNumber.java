package AdvanceQuestion;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class RepeatingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 5};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){

            int index = Math.abs(nums[i]);

            if(nums[index] < 0) return index;

            nums[index] = - nums[index];

        }
        return -1;
    }
}
