package twopointers;

public class IsPalindromeValid {

    public boolean isPalindromeValid(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // Skip non-alphanumeric characters from the left.
            // Note: isLetterOrDigit() can't handle characters that could not be represented in the original 16-bit design of Unicode.
            // e.g. emoji characters
            // Note: str.charAt returns value of the string at the specified index. The data type is char.
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from the right.
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // If the characters at the left and right pointers don't
            // match, the string is not a palindrome.
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Tests an empty string.\n Input: s=\"\"\n Expected output: true\n Actual output: " + new IsPalindromeValid().isPalindromeValid(""));
        System.out.println("Tests a single-character string.\n Input: s=\"a\"\n Expected output: true\n Actual output: " + new IsPalindromeValid().isPalindromeValid("a"));
        System.out.println("Tests a palindrome with two characters.\n Input: s=\"aa\"\n Expected output: true\n Actual output: " + new IsPalindromeValid().isPalindromeValid("aa"));
        System.out.println("Tests a non-palindrome with two characters.\n Input: s=\"ab\"\n Expected output: false\n Actual output: " + new IsPalindromeValid().isPalindromeValid("ab"));
        System.out.println("Tests a string with no alphanumeric characters.\n Input: s=\"!, (?)\"\n Expected output: true\n Actual output: " + new IsPalindromeValid().isPalindromeValid("!, (?)"));
        System.out.println("Tests a palindrome with punctuation and numbers.\n Input: s=\"21.02.2021\"\n Expected output: false\n Actual output: " + new IsPalindromeValid().isPalindromeValid("21.02.2021"));
        System.out.println("Tests a non-palindrome with punctuation.\n Input: s=\"hello, world!\"\n Expected output: false\n Actual output: " + new IsPalindromeValid().isPalindromeValid("hello, world!"));
    }
}
