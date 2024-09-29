public class Swap_two_Numbers {
    public static void main(String[] args) {
        int a = 9, b = 13;

        System.out.println("Before Swapping");
        System.out.println("a : " + a + " b : "+b );

        // Performing xor operation
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping");
        System.out.println("a : " + a + " b : "+b );
    }
}

// Input : a = 9 , b = 13
// Outpu : a = 13, b = 9
