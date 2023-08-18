package AdvanceQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionOfArray {

//    static void union(int[] arr1, int[] arr2){
//        int i = 0;
//        int j = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//
//        while(i < arr1.length && j < arr2.length){
//            if(arr1[i] < arr2[j]){
//                list.add(arr1[i]);
//                i++;
//            }
//            else if (arr2[j] < arr1[i]) {
//                list.add(arr2[j]);
//                j++;
//            }
//            else {
//                list.add(arr1[i]);
//                i++;
//                j++;
//            }
//        }
//        while (i < arr1.length){
//            list.add(arr1[i]);
//            i++;
//        }
//        while (j < arr2.length){
//            list.add(arr2[j]);
//            j++;
//        }
//        for (int k = 0; k < list.size(); k++) {
//            System.out.println(list.get(k));
//        }
//    }
    public static void main(String[] args) {
        int[] arr1 = { 2 ,5, 1 , 9};
        int[] arr2 = {4, 3, 1, 5, 9};
//        union(arr1,arr2);


        //solved using set

        HashSet<Integer> set = new HashSet<>();

        for (int k : arr1) {
            set.add(k);
        }
        for (int i : arr2) {
            set.add(i);
        }
        int[] union = new int[set.size()];
        int i = 0;

        for (int ans : set
             ) {
            union[i++] = ans;
        }
//        System.out.println(set);
        System.out.println(Arrays.toString(union));
        Intersection(arr1,arr2);
        System.out.println();

    }
    public
    static void Intersection(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
