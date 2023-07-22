import java.util.Arrays;
import java.util.*;
import static java.util.Collections.swap;

public class reverseTheArray {

    static void RecursiveSwapper(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] =temp;


        RecursiveSwapper(arr,start+1,end-1);
    }

    public static void main(String[] args) {
        int arr[] = inputarray.input();

        System.out.println(Arrays.toString(arr));

        int n = inputarray.input().length;
        RecursiveSwapper(arr,0,n-1);

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
