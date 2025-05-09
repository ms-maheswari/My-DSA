public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove all non-alphanumeric characters
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // Initialize two pointers
        int left = 0;
        int right = str.length() - 1;
        
        
        while (left < right) {
            // If characters don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;  
            }
            left++;  // Move left pointer forward
            right--;  // Move right pointer backward
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s) ? "Valid Palindrome": "Not valid Palindrome");
    }
}

// Input: s = "A man, a plan, a canal: Panama"

// Output: Valid Palindrome