// Pushes the maximum to the last index by adjacent swaps


public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {43,54,65,23,12};
        int n = arr.length;

        System.out.println("Original array:");

        // Use a loop to print the original array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorting the array using Insertion sort 
        int[] result = sort(arr, n);  //Call sort method 

        // Printing sorted array
        System.out.println("\n\nAfter Insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // Method to perform Insertion sort
    private static int[] sort(int[] arr, int n) {
        // Outer loop iterates from first index to last index

        for (int i = 0; i <= n - 1; i++) {
            int j = i; // Store the current index in j
            
            // Inner loop swaps elements until the current element is in its correct position
           
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j] and arr[j-1]
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--; //Move j to left
            }
        }
        // Return the sorted array
        return arr;
    }
}