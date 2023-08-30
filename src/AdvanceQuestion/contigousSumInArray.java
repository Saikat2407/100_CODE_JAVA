package AdvanceQuestion;

public class contigousSumInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, -3, 4, -1, -3};
        int ans1 = SubArraySum(arr);
        int ans2 = subArraySum(arr);
        System.out.println(ans2);
    }

    //time complexity :- O(n2)
    static int SubArraySum(int[] arr){
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                res = Math.max(res,sum);
            }
        }
        return res;
    }

    //O(n)
    static int subArraySum(int[] arr){
        int n = arr.length;
        int maxsum = arr[0];
        int currentsum = 0;

        for (int i = 0; i < n; i++) {
            currentsum = Math.max(0, currentsum) + arr[i];
            maxsum = Math.max(currentsum, maxsum);
        }
        return maxsum;
    }
}
