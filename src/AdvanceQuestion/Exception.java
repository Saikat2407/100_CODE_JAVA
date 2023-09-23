package AdvanceQuestion;

public class Exception {
    public static void main(String[] args) {

        final int saikat = 23;
//        saikat = 90;


        try {
            int n = 1000, x = 0;
            int[] arr = new int[n];
            for (int i = 0; i <= n; i++) {
                arr[i] = i / x;
            }

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("1st block = ArrayIndexOutOfBoundsException");
        }catch (ArithmeticException exception){
            System.out.println("2nd block = ArithmeticException");
        }catch(java.lang.Exception exception){
            System.out.println("3rd block = Exception");
        }
        finally {
            int a = 34, b = 6, c = 10;
            int sum = a+b+c;
            System.out.println(sum);
        }
    }
}
