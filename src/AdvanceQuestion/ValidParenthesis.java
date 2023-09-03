package AdvanceQuestion;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String sss = "()[]{}[";
        boolean ans = isValid(sss);
        System.out.println(ans);
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') {
                stack.push('}');
            }
            else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
