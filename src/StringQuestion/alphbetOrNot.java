package StringQuestion;

public class alphbetOrNot {
    public static void main(String[] args) {
        char ch = '0';
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " " + "character");
        }
        else System.out.println(ch+ " " + "is num");
    }
}
