//This is an algorith which finds the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

public class Kadanes_algorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;

        int res = maxSubarraySum(arr, n);  // Call the method to find the maximum subarray sum 
        System.out.println("Maximum sum is "+ res);
        
    }

    //Method to find maximum subarray sum

   public static int maxSubarraySum(int arr[], int n){
        
        int max = Integer.MIN_VALUE;  // max starts as the smallest possible integer value
        int sum = 0; // sum starts at 0

         // Iterate through the array to calculate subarray sums

         for (int i = 0; i < n; i++) {

            // Add the current element to the sum
            sum += arr[i];

            // Update the maximum sum if the current sum is greater
            if (sum > max) {
                max = sum;
            }

            // If the current sum becomes negative, reset it to 0
        
            if (sum < 0) {
                sum = 0;
            }
		}

        //return the maximum sum
		return max;

    }
}