import java.util.Scanner;

public class secondSmallest {

    public static void main(String[] args) {
//        int t = smallest();
//        System.out.println(t);
        System.out.println(smallest());
    }

    public static int smallest(){

        Scanner sc = new Scanner(System.in);
//        int arr[] = {12,5,34,890,77};
        int[] arr = new int[5];
        int n = arr.length;

        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        int smallestone = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallestone) {
                smallestone = arr[i];
            }
        }

        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            if(arr[i] != smallestone && arr[i] < secondsmallest){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;

    }
}
