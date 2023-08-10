package StringQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastcapitalOfString {
    public static void main(String[] args) {
        String s = "saikat hun nayek";
        String newstr = "";

        String[] str = s.split(" ");

        for (String string : str) {
            int length = string.length();

            String firstchar = Character.toString(string.charAt(0));
            String middle = string.substring(1,length-1);
            String lastchar = Character.toString(string.charAt(length-1));

            newstr += firstchar.toUpperCase() + middle + lastchar.toUpperCase() + " ";
        }
        System.out.println(newstr);
    }
}
