package Array;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] mainArray = {12,7,9,0,32,100,2};
        int[] subsetArray = {0,7,2,100};
        boolean ans = isSubset(mainArray,subsetArray);
        if (ans){
            System.out.println("Yes subset");
        }else System.out.println("No not a Subset");
    }

    public static boolean isSubset(int[] mainArray, int[] subsetArray){
        for (int subsetElement: subsetArray) {
            boolean found = false;
            for (int mainElement: mainArray) {
                if (subsetElement == mainElement){
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }


}
