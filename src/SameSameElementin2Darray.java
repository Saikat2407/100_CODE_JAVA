public class SameSameElementin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {2,3},
                {2,1},
                {4,8},
                {8,4},

        };
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = row+1; col < arr.length; col++) {
//                if(arr[row][0] == arr[col][1] && arr[row][1] == arr[col][0]){
//                    System.out.println("{" + arr[row][0] + " ," + arr[row][1] + "}");
//                }
//            }
//        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = row+1; col < arr.length; col++) {
                if (arr[row][0] == arr[col][1] && arr[row][1] == arr[col][0]){
                    System.out.println("{" + arr[row][0] + ", " + arr[row][1] + "}");
                    System.out.println("{" + arr[col][0] + ", " + arr[col][1] +"}");
                }
            }
        }
    }

}
