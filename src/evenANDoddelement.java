public class evenANDoddelement {
    public static void main(String[] args) {
        int[] arr1 = {100, 205, 300, 900, 1000, 1230};

        int n = arr1.length;
        int Counteven = 0, Countodd = 0;

        for (int i = 0; i < n; i++) {
            if(arr1[i] % 2 == 0){
                Counteven++;
            }else Countodd++;
        }
        System.out.println("Even : " + Counteven);
        System.out.println("Odd : " + Countodd);

    }
}
