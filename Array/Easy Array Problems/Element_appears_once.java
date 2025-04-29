public class Element_appears_once {
    public static int Element_occurs_once(int[] arr, int n) {
        int xorr = 0; // Initialize XOR result as 0
        // Perform XOR operation on all elements in the array
        for (int i = 0; i < n; i++) 
        {
            // If two bits are same, the result is 0 
            // If two bits are different, the result is 1
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int n = arr.length;
        int result = Element_occurs_once(arr,n);
        System.out.println("The element "+ result + " occurs once");
    }    
}

// Input : [4, 1, 2, 1, 2]
// Output : The element 4 occurs once