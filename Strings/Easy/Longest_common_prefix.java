import java.util.Arrays;

public class Longest_common_prefix {

    public static String longest_prefix(String str[]){

        // Sorting the array str[]
        Arrays.sort(str);
        int n = str.length;

        String s1 = str[0];  // First string in the sorted array
        String s2 = str[n - 1];  // Last string in the sorted array

        String op = "";  // Variable to store the common prefix

        // Loop through the characters of the first string
        for (int i = 0; i < s1.length(); i++) {
            // If the characters of both strings are the same, add to the prefix
            if (s1.charAt(i) == s2.charAt(i))
                op = op + s1.charAt(i);
            else
                break;  // Stop when characters no longer match
        }

        return op;  // Return the longest common prefix
    }
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        String result = longest_prefix(str);
        System.out.print("Longest common prefix is "+result);
    }
}

// Input: strs = ["flower","flow","flight"]

// Output: "fl"