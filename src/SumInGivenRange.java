public class SumInGivenRange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = rangesolver(0,a,b);
        System.out.println(sum);
    }

    static int rangesolver(int sum, int i, int b){
//        i = 10;
        if(i > b){
            return sum;
        }else{
            return i + rangesolver(sum,i+1,b);
        }
    }
}
