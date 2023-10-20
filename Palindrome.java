public class Palindrome {
    public static boolean isPalindrome(String str) {
        // Base case: a string with 0 or 1 character is always a palindrome
        if (str.length() <= 1) {
            return true;
        }
        
        // Check if the first and last characters are equal
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        
        // Recursively check the substring without the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }
    
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";
        
        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }
        
        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome");
        } else {
            System.out.println(str2 + " is not a palindrome");
        }
    }
}