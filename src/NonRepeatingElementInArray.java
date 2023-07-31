public class NonRepeatingElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        nonRepeater(arr);
    }

    static void nonRepeater(int[] arr){
        int n =  arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]){
                    count++;
                }
            }
            if (count == 1) System.out.println(arr[i]);
        }
    }
}
