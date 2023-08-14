package StringQuestion;

public class RemoveSpecialchar {
    public static void main(String[] args) {
        String str = "saikat&5*:[";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > 64 && str.charAt(i) <= 90 || str.charAt(i) > 96 && str.charAt(i) <= 122){
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
