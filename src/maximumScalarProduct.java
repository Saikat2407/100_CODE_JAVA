import java.util.Arrays;
import java.util.Collections;

public class maximumScalarProduct {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 6, 3, 7};
        Integer[] arr2 = new Integer[]{10, 7, 45, 3, 7};
        System.out.println(multiply(arr1, arr2));

    }
    static int multiply(Integer[] arr1, Integer[] arr2){

        Arrays.sort(arr1);

        //if they ask you to find the maximum of scalar product then sort the array in ascending Order else
        Arrays.sort(arr2);

        int product = 0;
        for (int i = 0; i < arr1.length; i++){
            product += arr1[i] * arr2[i];
        }
        return product;
    }
}
