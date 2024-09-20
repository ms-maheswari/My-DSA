package Easy;

public class Remove_Outermost {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        
        // Counter to track the number of open parentheses
        int openCount = 0;

        // Iterate through the string by converting it into a character array
        for (char c : s.toCharArray()) {
            // If the current character is an opening parenthesis '('
            if (c == '(') {
                // Append it to the result only if there are already open parentheses
                // (i.e., it's not an outermost opening parenthesis)
                if (openCount > 0) {
                    result.append(c);
                }
                // Increment the openCount to track the balance of parentheses
                openCount++;
            } 
            // If the current character is a closing parenthesis ')'
            else if (c == ')') {
                // Decrement the openCount first to track the balance of parentheses
                openCount--;
                
                // Append it to the result only if there are still open parentheses
                // (i.e., it's not an outermost closing parenthesis)
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();  
    }
}

// Input: String s = "(()())(())(()(()))"
// Output : "()()()"