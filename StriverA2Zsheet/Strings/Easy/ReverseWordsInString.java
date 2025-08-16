import java.util.Scanner;

public class ReverseWordsInString {

    // Method to reverse words
    public static String reverseWords(String s) {
        // Step 1: Trim leading/trailing spaces
        s = s.trim();

        // Step 2: Split by one or more spaces
        String[] words = s.split("\\s+");

        // Step 3 & 4: Reverse and join words with single space
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    // Main method with custom input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = reverseWords(input);

        System.out.println("Reversed words: " + result);
    }
}

