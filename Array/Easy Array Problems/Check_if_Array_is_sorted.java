public class Check_if_Array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {43,12,72,1,5,3};
        int n = arr.length;

        boolean result = isSorted(arr,n);  // Call the isSorted method to check if the array is sorted
        if(!result) //if the result is true 
           System.out.println("Not a Sorted Array");
        else
           System.out.println("Sorted Array");
           
    }
    // Method to check if array is sorted or not
    private static boolean isSorted(int[] arr, int n) {
        for(int i=1;i<n;i++) // Iterate the loop from index 1 to n-1 index
        { 
            if(arr[i] < arr[i-1]) 
            { 
                 // If the current element is less than the previous element, the array is not sorted
                return false;
            }
        }
        // If the loop completes without finding any unsorted elements, the array is sorted
        return true;
    }
}
