public class Set_Kth_bit {
    public static void main(String[] args) {
        int n = 10, k = 2;
        // Left shift the k by 1 bit and perform OR operation with n
        int result = n | (1 << k);
        System.out.println(result);
    }
}


// Input : N = 10, K = 2
// Output : 14

// Input : N = 15, k = 3
// Output : 15