package StringQuestion;

import java.util.Scanner;

public class countCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        System.out.println("Character\tFrequency");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(ch == str.charAt(i)){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(ch + "\t\t\t" + count);
            }
        }
        
    }
}
