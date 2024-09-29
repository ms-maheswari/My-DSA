public class Power_of_two_or_not {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(isPowerofTwo(n) ? "True" : "False");
    }
    static boolean isPowerofTwo(int n){
        if((n & (n - 1)) == 0)
           return true;
        return false;
    }
}


// Input: n = 16
// Output: true

// Input: n = 3
// Output: false
