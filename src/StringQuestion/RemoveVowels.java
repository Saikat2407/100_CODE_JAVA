package StringQuestion;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        String n = "saikat";
        Remover(n);
    }
    static void Remover(String s){
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o'&& ch[i] != 'u'){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
    }
}
