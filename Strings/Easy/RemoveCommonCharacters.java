public class RemoveCommonCharacters {
    public static String removeCommon(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            // If character is not present in str1, keep it
            if (str1.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "character";

        String output = removeCommon(string1, string2);
        System.out.println("Original String2: " + string2);
        System.out.println("After removal     : " + output);
    }
}

// Input :

// s1 = "abc" , s2 = "character"

// Output:

// Original String2: character
// After removal     : hrter