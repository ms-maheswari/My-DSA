public class Roman_to_Integer {
    public static int romanToInt(String s) {
        int ans = 0; // Final answer
        int num = 0; // Holds value of current Roman numeral

        // Iterate from end of the string to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            // Determine value of the current Roman numeral character
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;

                case 'V':
                    num = 5;
                    break;

                case 'X':
                    num = 10;
                    break;

                case 'L':
                    num = 50;
                    break;

                case 'C':
                    num = 100;
                    break;

                case 'D':
                    num = 500;
                    break;

                case 'M':
                    num = 1000;
                    break;
            }

            // Apply subtraction rule:
            // If 4 times the current numeral is less than the accumulated answer,
            // it means we should subtract instead of add (e.g., IV = 5 - 1)
            if (4 * num < ans) {
                ans = ans - num;
            } else {
                ans = ans + num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV"; // Roman numeral to convert (1994)
        int result = romanToInt(s); // Call conversion method
        System.out.println("Integer value of " + s + " is: " + result);
    }
}


// Input : "MCMXCIV"    Output : 1994

// Input : "III"        Output : 3
