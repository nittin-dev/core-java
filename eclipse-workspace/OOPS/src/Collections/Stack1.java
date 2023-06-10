package Collections;
import java.util.*;
public class Stack1 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "()[]{}";
        System.out.println(input1 + " is valid: " + isValid(input1));

        String input2 = "([)]";
        System.out.println(input2 + " is valid: " + isValid(input2));

        String input3 = "{[()]}";
        System.out.println(input3 + " is valid: " + isValid(input3));
    }
}
