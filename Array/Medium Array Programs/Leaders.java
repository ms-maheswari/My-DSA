// Leader is an element that is greater than or equal to all elements to its right side in the array

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        // Define the input array
        int[] arr = {16, 17, 4, 3, 5, 2};
        // Get the length of the array
        int n = arr.length;

        // Create an ArrayList of Integer type named 'result' to store the leaders
        ArrayList<Integer> result = leaders(arr, n);

        // Print the leaders
        System.out.print("Leaders: " + result);
    }

    // Method to find the leaders in the array
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Create an ArrayList to store the leader elements
        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize 'max' with the last element of the array, as the rightmost element is always a leader
        int max = arr[n - 1];
        // Add the last element to the list of leaders
        ans.add(arr[n - 1]);

        // Iterate through the array from the second last element to the first element
        for (int i = n - 2; i >= 0; i--) {
            // Check if the current element is greater than or equal to the 'max'
            if (arr[i] >= max) {
                // Add the current element to the list of leaders
                ans.add(arr[i]);
                // Update 'max' to the current element
                max = arr[i];
            }
        }

        // Reverse the list to maintain the order of leaders as they appear in the original array
        Collections.reverse(ans);

        // Return the list of leaders
        return ans;
    }
}
