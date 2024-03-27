import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine(); // Get the input string

        boolean result = isPalindrome(str); // Call the isPalindrome method to check

        // if the result is true, that is if it is a palindrome print "Palindrome"

        if (result)
            System.out.println("The given string \"" + str + "\" is a Palindrome");
        else
            System.out.println("The given string \"" + str + "\" is Not a Palindrome");
    }

    // Method to check whether it is palindrome or not

    private static boolean isPalindrome(String str) {

         // Convert the input string to lowercase and replace all non-alphanumeric characters

        String strn = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0; // Assign starting index as 0
        int right = strn.length() - 1; // Assign last index

        while (left <= right) { // If left is less than or equal to right
            if (strn.charAt(left) != strn.charAt(right))  // If the characters are not equal, it returns false
            { 
                return false;
            }
            left++; // increments from start to end
            right--; // decrements from end to start
        }
        return true;
    }
}
