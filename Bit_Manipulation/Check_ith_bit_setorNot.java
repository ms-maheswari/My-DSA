// A bit is called set if it is 1 else not a set
public class Check_ith_bit_setorNot {
    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(checkKthBit(n, k) ? "Set" : "Not Set");

    }
    static boolean checkKthBit(int n, int k) {
        // K value is left shift by 1 and performing and operation with n 
        // If that is not equal to 0 then it is Set
        if((n & (1 << k)) != 0) 
           return true;
        return false;
    }
}

// Input : n = 4, k = 0
// Output : Not Set

// Input : n = 4, k = 2
// Output : Set
