package AdvanceQuestion;

public class contigousSumInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, -1, -2, 1, 5};
        int ans = SubArraySum(arr);
        System.out.println(ans);
    }

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
}
