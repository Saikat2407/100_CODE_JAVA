import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromarray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 4, 6, 8, 1, 100, 200};
        remove(arr, arr.length);
    }

    static void remove(int[] arr, int n){
        Arrays.sort(arr);
        n = arr.length;

        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            duplicate.add(arr[i]);
        }
        System.out.println(duplicate);
    }
}


