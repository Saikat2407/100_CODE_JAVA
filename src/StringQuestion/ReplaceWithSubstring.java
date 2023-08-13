package StringQuestion;

public class ReplaceWithSubstring {
    public static void main(String[] args) {
        String str = "SAIKAT NAYEK";
        String oldstring = "NAYEK";
        String newstring = "IS A BAD BOY";
        String Ans = str.replace(oldstring,newstring);
        System.out.println(Ans);
    }

}
