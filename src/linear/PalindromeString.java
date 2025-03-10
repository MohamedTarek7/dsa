package linear;

public class PalindromeString {
    public static boolean isPalindrome(String s) {
        int length = s.length();
        
        if (s.isEmpty()) {
            throw new IllegalArgumentException("String must not be null/empty, and it should at least have 2 characters.");
        }

        if (length == 1) {
            return true;
        }

        int j = length - 1;

        for (int i = 0; i < length / 2; i++) {
            if (condition) {
                
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
