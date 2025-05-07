public class Reverse_Words {
    public static String reverseWords(String s) {
        // Split the input string into words by using spaces (removes extra spaces as well)
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder to efficiently build the reversed sentence
        StringBuilder res = new StringBuilder();

        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);  // Append each word
            if (i > 0) {
                res.append(" ");  // Add a space after each word except the last one
            }
        }

        // Return the resulting string as the reversed sentence
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        reverseWords(s);
        System.out.print(reverseWords(s));
    }
}

// Input: s = "the sky is blue"
// Output: "blue is sky the"