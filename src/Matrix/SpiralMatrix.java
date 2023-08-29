package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
//                {13, 14, 15, 16}
        };
        List<Integer> finalans = printSpiral(mat);
        for (int i = 0; i < finalans.size(); i++) {
            System.out.print(finalans.get(i) + " ");
        }
        System.out.println();
    }

    static List<Integer> printSpiral(int[][] matrix){
        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, top = 0, bottom = n-1, right = m-1;
        while (top <= bottom && left <= right){

            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom ; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom){
                for (int i = right; i >= left ; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right){
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
