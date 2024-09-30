package Array.Hard;
public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        // Sample input array
        int arr[] = {2, 3, -2, 4}; 
        int n = arr.length;

        // Call the function to get the maximum product subarray result
        int result = maxProduct(arr, n);

        // Output the result
        System.out.println("Maximum product subarray is " + result);
    }

    // Function to find the maximum product subarray
    static int maxProduct(int arr[], int n) {
        // Variables to store the prefix and suffix products
        int pre = 1, suff = 1;

        // Initialize ans with the minimum possible integer value
        int ans = Integer.MIN_VALUE;

        // Loop through the array to calculate prefix and suffix products
        for (int i = 0; i < n; i++) {
            // Reset prefix to 1 if it becomes 0
            if (pre == 0)
                pre = 1;

            // Reset suffix to 1 if it becomes 0
            if (suff == 0)
                suff = 1;

            // Multiply current element to prefix product
            pre = pre * arr[i];

            // Multiply the corresponding element from the end to suffix product
            suff = suff * arr[n - i - 1];

            // Update the answer with the maximum value between prefix and suffix products
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans; // Return the maximum product subarray
    }
}
