package StringQuestion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "AMMA";
//        StringBuilder ss = new StringBuilder();
        String ss = "";

        for (int i = str.length()-1; i >= 0; i--) {
            ss = ss + str.charAt(i);
//            ss.append(str.charAt(i));
        }
        if(str.equals(ss)){
            System.out.println("yes palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
