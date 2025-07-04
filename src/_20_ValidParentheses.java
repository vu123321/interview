import java.util.ArrayDeque;
import java.util.Deque;

public class _20_ValidParentheses {

    public static void main(String[] args) {

        System.out.println("result: "+isValid("()[]{}"));
    }

    private static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty() || !match(stack.pop(), c)) {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

    private static boolean match(char leftBracket, char rightBracket) {
        return (leftBracket == '(' && rightBracket == ')') ||
                 ( leftBracket == '[' && rightBracket == ']')
                || ( leftBracket == '{' && rightBracket == '}');
    }
}
