package Array;

import java.util.HashSet;

public class DisjointOfArray {
    public static void main (String[] args) {
        int[] arr1 ={1,3,4,5,2};
        int[] arr2 ={2,4,3,1,7,5,15};

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
