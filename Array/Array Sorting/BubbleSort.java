// It pushes the maximum to the last index by adjacent swaps

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Method to perform Bubble sort

     static void bubbleSort(int[] arr, int n) {
         // Outer loop iterates from the first element to the last unsorted element
         for (int i = 0; i < n - 1; i++) {
            
            // Inner loop performs adjacent swaps within the unsorted portion of the array

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements and swap if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];  
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp;  
                }
            }
        }
    }
}


// Time Complexity : O(n²)	
// Space Complexity : O(1)