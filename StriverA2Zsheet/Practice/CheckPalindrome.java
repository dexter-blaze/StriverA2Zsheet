// public class CheckPalindrome {
//     static String str = "madam";
//     public static void checkPalindrome(int i, String str){
//         if(str == null || str.isEmpty()) {
//             System.out.println("String is empty or null");
//             return;
//         }

//         if(str.length() == 1) {
//             System.out.println("String is a palindrome");
//             return;
//         }

//         if(i>= str.length() / 2){
//             System.out.println("String is a palindrome");
//             return;
//         }
//         if(str.charAt(i) != str.charAt(str.length()-i-1)){
//             System.out.println("String is not a palindrome");
//             return;
//         } else {
//             checkPalindrome(i + 1, str);
//         }
//     }
//     public static void main(String[] args) {
//         checkPalindrome(0, "a");
//     }
// }
// Functional Recursion:
public class CheckPalindrome {
    static String str = "madam";
    public static boolean checkPalindrome(int i, String str){
        if(str == null || str.isEmpty()) {
            return false;
        }

        if(str.length() == 1) {
            return true;
        }

        if(i>= str.length() / 2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        } else {
            return checkPalindrome(i + 1, str);
        }

    }
    public static void main(String[] args) {
        boolean op = checkPalindrome(0, str);
        System.out.println(op ? "String is a palindrome" : "String is not a palindrome");
    }
}
