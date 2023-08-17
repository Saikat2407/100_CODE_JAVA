package Array;

import Array.inputarray;

public class sumofarray {
    public static void main(String[] args) {

//        System.out.println(adder(Array.inputarray.input(add),0,Array.inputarray.input().length-1));
        int[] t = inputarray.input();
        int last = inputarray.input().length;

        System.out.println(adder(t,0,last));

    }

    static int adder(int[] a, int index, int indexLast){
//        indexLast = a.length-1;
        if(index == indexLast-1){
            return a[index];
        }

        else return a[index] + adder(a,index+1, indexLast);
    }
}
