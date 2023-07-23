import java.util.Arrays;

public class binarysearch {

    static int binarysearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]) start = mid+1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-12, -8, -3, 0, 1, 88, 100, 120, 760};
        int target = 88;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }

}
