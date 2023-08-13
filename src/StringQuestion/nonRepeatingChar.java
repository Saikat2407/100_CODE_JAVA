package StringQuestion;

import java.util.ArrayList;

public class nonRepeatingChar {
    public static void main(String[] args) {
        String str = "prepinsta";
        str = str.toLowerCase();
        StringBuilder string = new StringBuilder();

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if(ch[j] == ch[i]){
                    count++;
                }
            }
            if (count ==1){

            }
        }

    }
}
