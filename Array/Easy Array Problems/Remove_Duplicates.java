public class Remove_Duplicates {
    public static int remove(int[] arr, int n) {
        int i = 0; 
        for (int j = 1; j < n; j++) 
        {
            if (arr[i] != arr[j]) 
            // Check if the current element is equal to the 0th index or not.
            // If not, then the index is incremented
            {
                i++;
                arr[i] = arr[j];    
            }
        }
        return i + 1; // Return the length of the unique array elements
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int n = arr.length;
        int res = remove(arr, n); 
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}

// Input : [1, 2, 2, 3, 4, 5, 5]
// Output : 1 2 3 4 5 