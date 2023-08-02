import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromarray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(120);
        arr.add(2);
        arr.add(44);
        arr.add(3);

        remove(arr, arr.size());
    }

    static void remove(ArrayList<Integer> arr, int n){
        Arrays.sort(new ArrayList[]{arr});
//        n = arr.size();

        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            duplicate.add(arr.get(i));
        }
        System.out.println(duplicate);
    }
}


