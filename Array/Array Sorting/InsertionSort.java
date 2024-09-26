// Select an element and place it in corresponding position until it gets sorted

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
       int[] arr = {12, 11, 13, 5, 6};
       int n = arr.length;
        insertionsort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    

    // Method to perform Insertion sort
    static void insertionsort(int[] arr, int n) {
        // Iterates from first index to last index

        for (int i = 0; i <= n - 1; i++) {
            int j = i; // Store the current index in j
            
            //Swaps elements until the current element is in its correct position
           
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j] and arr[j-1]
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--; 
            }
        }
    }
}

// Time Complexity : O(n²)	
// Space Complexity : O(1)