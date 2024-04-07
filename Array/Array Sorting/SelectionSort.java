// It selects the minimum from the array and swap

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {43,54,65,23,12};
        int n = arr.length;

        System.out.println("Original array:");

        // Use a loop to print the original array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorting the array using selection sort
        int[] result = sorting(arr, n);  //Call sort method 

        // Printing sorted array
        System.out.println("\n\nAfter selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // Method to perform selection sort

    private static int[] sorting(int[] arr, int n) {

       // Outer loop iterates from the first index to the last
        for(int i=0;i<n-1;i++){
        int min = i;  // Assume the current index has the minimum element

        // Inner loop finds the index of the minimum  element in the unsorted part of the array
        for(int j=i+1;j<n;j++){
            if(arr[j] < arr[min]){
                min = j;
            }
        }
        // Swap the minimum element with the first element of the unsorted part
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
       }
       // Return the sorted array
       return arr;
    }
}
