import java.util.Arrays;
import java.util.Collections;

public class multiplytwoarrayinOrder {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 6, 3, 7};
        Integer[] arr2 = new Integer[]{10, 7, 45, 3, 7};
        System.out.println(multiply(arr1, arr2));

    }

    static int multiply(Integer[] arr1, Integer[] arr2){

        //if they ask you to find the minimum of scalar product then sort the first array in ascending Order & the second array in descending order
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        int product = 0;
        for (int i = 0; i < arr1.length; i++){
            product += arr1[i] * arr2[i];
        }
        return product;
    }
}
