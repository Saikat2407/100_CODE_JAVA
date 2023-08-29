package Matrix;

import java.util.Arrays;

public class SearchElementInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 5, 66},
                {8, 90, 100},
                {1, 21, 97}
        };

        int[] ans = positionfinder(arr,90);
        System.out.println("Found at index : "+Arrays.toString(ans));
    }

    static int[] positionfinder(int[][] matrix, int target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
