import java.util.*;

class Solution {
    boolean solution(String s) {
        return isCorrectParentheses(s);
    }


    private boolean isCorrectParentheses(String s) {
        Stack stack = new Stack();

        char open = '(';
        char close = ')';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == open) {
                stack.push(c);
            } else if (c == close) {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.empty()) {
            return false;
        }
        return true;
    }

}
