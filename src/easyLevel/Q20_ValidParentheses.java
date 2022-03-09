package easyLevel;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 09-Mar-22
 */

import java.util.Scanner;
import java.util.Stack;

public class Q20_ValidParentheses {
    public static void main(String[] args) {
        Q20_ValidParentheses validParentheses = new Q20_ValidParentheses();
        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(validParentheses.isValid(s));

    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();


    }
}
