package StringQuestion;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String saikat = sc.next();
        char[] ch = saikat.toCharArray();

        int vowel = 0;
        for (int i = 0; i < ch.length; i++) {
            if(saikat.charAt(i) == 'a' || saikat.charAt(i) == 'e' || saikat.charAt(i) == 'i' ||
                    saikat.charAt(i) == 'o' || saikat.charAt(i) == 'u'){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}
