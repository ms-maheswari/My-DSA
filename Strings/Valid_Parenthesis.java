import java.util.Stack;

public class Valid_Parenthesis {

    public static boolean isValid(String s) {
        // Create a stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {

            // If the character is an opening parenthesis, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
           
            // If the character is a closing parenthesis
            else if (c == ')' || c == ']' || c == '}') {
                
                // If the stack is empty, there is no corresponding opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char top = stack.pop();
                // Check if the popped element matches the current closing parenthesis
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses were matched correctly
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s) ? "Valid Parenthesis" : "Not a valid Parenthesis");
    }
}

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false