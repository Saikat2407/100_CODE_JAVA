import java.util.Arrays;

public class jata {
    public static void main(String[] args) {
        int[] arr = {4 ,5, 3, 6, 7};
        int[] ans = getSecondOrderElements(arr.length, arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        Arrays.sort(a);
        int secondlargest = a[n-2];
        int secondsmallest = a[1];
        int[] result = {secondlargest, secondsmallest};

//        result[0] = secondlargest;
//        result[1] = secondsmallest;

        return result;
    }
}
