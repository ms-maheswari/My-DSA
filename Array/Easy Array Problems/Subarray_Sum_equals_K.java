// In this program we have to find the length of longest subarray whose sum is equal to the given sum K

public class Subarray_Sum_equals_K {
    public static int long_subarray(int[] arr, int n, int K) {
        int count = 0;
        for (int i = 0; i < n; i++) 
        { 
            int sum = 0; 
            for (int j = i; j < n; j++) { 
                // add the current element to the subarray 
                sum += arr[j];
                if (sum == K)  // Check if the current sum is equal to the target sum K
                {
                      // Update the length of the longest subarray if the current subarray is longer
                    count++;
                }  
                    
            }
        }
        return count;
}
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int n = arr.length;
        int K = 1; //Target sum K is given as 1

        // the result is finding the length of longest subarray with sum equal to the target K
        int result = long_subarray(arr,n,K);
        System.out.println("The length of the longest subarray is "+result);
    }
}

// Input : [-1, 1, 1], target_sum = 1
// Output : 3