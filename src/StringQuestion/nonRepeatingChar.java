package StringQuestion;

public class nonRepeatingChar {
    public static void main(String[] args) {
        String str = "Saikat";
        str = str.toLowerCase();

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 1; j < ch.length; j++) {
                if (ch[i] != ch[j]){

                }
            }
        }
    }
}
