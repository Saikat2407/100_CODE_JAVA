import java.util.Arrays;

public class linearsearchInRange {
    static int Rangesolver(int[] arr, int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = inputarray.input();
        System.out.println(Arrays.toString(arr));
        System.out.println(Rangesolver(arr,1,3,890));
    }
}
