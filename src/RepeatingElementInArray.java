public class RepeatingElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 2, 3, 2};
        int n = arr.length;

        repeater(arr,n);
    }

    static void repeater(int[] arr, int n){

        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
