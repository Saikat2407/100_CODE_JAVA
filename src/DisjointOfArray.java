import java.util.HashSet;

public class DisjointOfArray {
    public static void main (String[] args) {
        int[] arr1 = {10, 51, 3, 43, 6};
        int[] arr2 = {80, 71, 29, 2};

        if (disjoint(arr1, arr2))
            System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean disjoint(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])){
                return false;
            }
        }
        return true;
    }
}
