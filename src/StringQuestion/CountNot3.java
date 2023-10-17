package StringQuestion;

public class CountNot3 {
    public static void main(String[] args) {
        int n = 45;
        int ans = count_not_3(n);
        System.out.println(ans);
    }

    public static int count_not_3(int n){
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(!String.valueOf(i).contains("3")){
                count++;
            }
        }

        return count;
    }
}
