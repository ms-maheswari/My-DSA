package Array.Hard;
public class Repeating_Missing_number {
    public static void main(String[] args) {
        // Define the array with repeating and missing numbers
        int arr[] = {3, 1, 2, 5, 3};
        int n = arr.length;  // Get the length of the array

        // Call the function to find the repeating and missing number
        int result[] = findRep_Miss(arr, n);

        // Output the result
        System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
    }

    // Function to find the repeating and missing numbers
    static int[] findRep_Miss(int arr[], int n) {
        int repeat = -1, missing = -1;  // Initialize variables for repeating and missing numbers

        // Loop through possible numbers from 0 to n-1
        for (int i = 0; i < n; i++) {
            int count = 0;  // Initialize the count for each number

            // Inner loop to count occurrences of the current number i
            for (int j = 0; j < n; j++) {
                if (arr[j] == i)  // If the current array element matches i, increment count
                   count++;
            }

            // If the number is repeated twice, assign it to 'repeat'
            if (count == 2) 
               repeat = i;
               
            // If the number is missing, i.e., its count is 0, assign it to 'missing'
            else if (count == 0)
               missing = i;
            
            // If both repeating and missing numbers are found, exit the loop early
            if (repeat != -1 && missing != -1)
                break;
        }

        // Return the result as an array
        int[] ans = {repeat, missing};
        return ans;
    }
}

// Input: arr[] = {3, 1, 2, 5, 3}
// Output: The repeating and missing numbers are: {3, 0}
