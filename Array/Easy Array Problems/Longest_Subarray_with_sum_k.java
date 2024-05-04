// In this program we have to find the length of longest subarray whose sum is equal to the given sum K

public class Longest_Subarray_with_sum_k {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int n = arr.length;

        int K = 3; //Target sum K is given as 3

        // the result is finding the length of longest subarray with sum equal to the target K
        int result = long_subarray(arr,n,K);
        System.out.println("The length of the longest subarray is "+result);
    }

    // Method to calculate the length of longest subarray
    private static int long_subarray(int[] arr, int n, int K) {
        int len = 0;
        for (int i = 0; i < n; i++) 
        { 
            int sum = 0; // Sum variable
            for (int j = i; j < n; j++) { 
                // add the current element to the subarray 
                sum += arr[j];

                if (sum == K)  // Check if the current sum is equal to the target sum K
                {
                      // Update the length of the longest subarray if the current subarray is longer
                    len = Math.max(len, j - i + 1); 
                }  
                    
            }
        }
        return len;
}

}
