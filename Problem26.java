// Problem 26: WAP to check valid Paranthesis
import java.util.Stack;

class Problem26 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Problem26 sol = new Problem26();
        String s1 = "()[]{}";
        String s2 = "([)]";
        System.out.println(s1 + " is valid: " + sol.isValid(s1));
        System.out.println(s2 + " is valid: " + sol.isValid(s2));
    }
}