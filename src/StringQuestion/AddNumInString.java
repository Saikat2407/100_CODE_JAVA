package StringQuestion;

import java.util.Arrays;

public class AddNumInString {
    public static void main(String[] args) {
        String str = "1sa7ik2kal";
        char[] ch = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int sum = 0;

        for ( char cht: ch) {
            if (Character.isDigit(cht)){
                sum += Character.getNumericValue(cht);
            }
        }

        System.out.println(sum);
    }
}
