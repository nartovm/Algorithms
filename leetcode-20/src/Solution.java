import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char pop = stack.pop();
                    if (pop != c) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        char[] charArray = s.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            char currentChar = charArray[i];
            //if closed
            if (currentChar == ')') {
                stack.push('(');
            } else if (currentChar == '}') {
                stack.push('{');
            } else if (currentChar == ']') {
                stack.push('[');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (currentChar != stack.pop()) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("([)]"));
    }
}