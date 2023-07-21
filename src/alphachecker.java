public class alphachecker {

    public static void main(String[] args) {
        char ch = 'e';
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is vowel");
            default -> System.out.println("ch is constant: " + ch);
        }
    }
}
