package StringQuestion;

import java.util.Arrays;

public class AnagramOrTwoStringEqualOrNot {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cbda";

        char[] c = s1.toCharArray();
        char[] d = s2.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d)){
            System.out.println("Anagram");
        }
        else if (c.length != d.length){
            System.out.println("Not Anagram");
        }
        else System.out.println("Not anagram");
    }

}
