// It pushes the maximum to the last index by adjacent swaps


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {43,54,65,23,12};
        int n = arr.length;

        System.out.println("Original array:");

        // Use a loop to print the original array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorting the array using Bubble sort 
        int[] result = sort(arr, n);  //Call sort method 

        // Printing sorted array
        System.out.println("\n\nAfter Bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // Method to perform Bubble sort

    private static int[] sort(int[] arr, int n) {
        // Outer loop iterates from the last index to the first
        for (int i = n - 1; i >= 0; i--) {

            // Inner loop iterates from the first index to the (i-1)th index
            for (int j = 0; j <= i - 1; j++) {
                
                // If current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Return the sorted array
        return arr;
    }
}
