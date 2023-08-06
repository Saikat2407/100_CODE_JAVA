package StringQuestion;

public class LengthOfString {
    public static void main(String[] args) {
        int length = 0;
        String sh = "SAIKATNAYEK";
        for (char c1 : sh.toCharArray()) {
            length++;
        }
        System.out.println(length);
    }
}
