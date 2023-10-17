package Array;

public class sortingthroughbubble {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        bubble(arr);
    }

//    static void bubble(int[] arr){
//        int n = arr.length;
//        int temp;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n/2; j++) {
//                if (arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//            for (int j = n/2; j < n-1; j++) {
//                if (arr[j] < arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
    static void bubble(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length/2; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for (int j = arr.length/2; j < arr.length-1; j++) {
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
