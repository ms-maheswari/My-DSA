public class Reverse_array {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int n = array.length;
        System.out.println("Original array elements:");

        // Use a loop to print the original array elements
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int[] result = reverse(array, n);  // Call the reverse method to reverse the array
        System.out.println("\nReversed array elements:");
        
        // Use a loop to print the reverse array elements
        for(int i=0;i<n;i++){
            System.out.print(result[i]+ " ");
        }
    }

     // Method to reverse the given array in-place

    private static int[] reverse(int[] nums, int n) {
         // Initialize start and end pointers
        int start = 0;
        int end = n - 1;

        // Swap elements at start and end indices until the pointers meet
        while (start < end) {
            // Swap the elements
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }
        return nums;
    }
}
