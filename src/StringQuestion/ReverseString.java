package StringQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "SAIKAT";
        String ss = "";
        for (int i = str.length()-1; i >= 0; i--) {
            ss += str.charAt(i);
        }
        System.out.println(ss);
    }
}
