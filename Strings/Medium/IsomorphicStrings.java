package Medium;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        
        System.out.println(areIsomorphic(s1, s2)); // Output: true
        
        s1 = "foo";
        s2 = "bar";
        System.out.println(areIsomorphic(s1, s2)); // Output: false
    }

    public static boolean areIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Lengths must be equal
        }

        // Arrays to track mappings
        int[] mapS = new int[256]; // For characters in string s
        int[] mapT = new int[256]; // For characters in string t

        // Iterate through each character
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if mapping is consistent
            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
