package Array;

import java.util.Scanner;

class swapmain {
    public static void main(String[] args) {
        swapper();
    }
    static void swapper(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        int b = sc.nextInt();
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

}


