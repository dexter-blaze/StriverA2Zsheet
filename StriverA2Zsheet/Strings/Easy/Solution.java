import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a valid parentheses string: ");
        String s = sc.nextLine();

        // Call the method
        String result = removeOuterParentheses(s);

        // Output the result
        System.out.println("Result after removing outer parentheses: " + result);
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch);  // Only append if not outermost
                }
                depth++;  // Going deeper
            } else {  // ch == ')'
                depth--;  // Coming back up
                if (depth > 0) {
                    result.append(ch);  // Only append if not outermost
                }
            }
        }

        return result.toString();
    }
}
