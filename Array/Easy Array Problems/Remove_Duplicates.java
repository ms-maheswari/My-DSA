public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int n = arr.length;

        int res = remove(arr, n); //Call the remove method to remove duplicates
        System.out.print("Resultant array: ");
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to remove duplicates from the given array

    private static int remove(int[] arr, int n) {

        int index = 0; //Initialize index as 0
        for (int i = 1; i < n; i++) //Iterate the loop from index 1 to n-1 index
        {
            if (arr[i] != arr[index]) 
            // Check if the current element is equal to the 0th index or not.
            // If not, then the index is incremented
            {
                arr[index + 1] = arr[i];
                index++;
            }
        }
        return index + 1; // Return the length of the resultant array
    }
}
