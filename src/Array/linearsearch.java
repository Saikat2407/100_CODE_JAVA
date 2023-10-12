package Array;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = inputarray.input();
        System.out.println(linearsearch(arr,890));
    }

    public static int linearsearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
