package Array;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int n = 5;
        int sum = getsumprevious(n);

        System.out.println(sum);
    }

    static int getsumprevious(int n){
        if(n==0){
            return n;
        }else {
            return n + getsumprevious(n-1);
        }
    }
}
