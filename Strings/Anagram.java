import java.util.Arrays;

public class Anagram {
     public static boolean isAnagram(String s, String t) {

        // If length of both strings are different then not anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Converting string to character array and sort them
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        // Check character of both arrays equal or not
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != tt[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        isAnagram(s,t);
        System.out.println(isAnagram(s, t) ? "Anagram" : " Not an Anagram");
    }
}

// Input: s = "anagram", t = "nagaram"

// Output: true