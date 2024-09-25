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

     static int[] sort(int[] arr, int n) {
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
        // Return the sorted array
        return arr;
    }
}


// Input : arr[] = {43,54,65,23,12}

// Output: [12, 23, 43, 54, 65]