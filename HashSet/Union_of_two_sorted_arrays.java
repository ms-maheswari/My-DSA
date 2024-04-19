// HashSet is used to store the unique elements and it will automatically remove the duplicates 

import java.util.HashSet;

public class Union_of_two_sorted_arrays {
    public static void main(String[] args) {
        // Define the first sorted array
        int[] arr1 = {1, 2, 3, 4, 5};
        // Define the second sorted array
        int[] arr2 = {3, 4, 5, 6, 7};

        // Length of the arrays
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Declare result as array to store final result
        int[] result = union(arr1, arr2, n1, n2);  

        // Loop to print the result 
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    // Method to find the union of two sorted arrays
    private static int[] union(int[] arr1, int[] arr2, int n1, int n2) {
        // Declare a HashSet of Integer type to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements of array 1 to the set
        for(int i=0; i<n1; i++){
            set.add(arr1[i]); 
        }

        // Add elements of array 2 to the set
        for(int i=0; i<n2; i++){
            set.add(arr2[i]);
        }

        // Convert HashSet to array
        int[] result = new int[set.size()]; // Create a result array with size of the set
        int index = 0;

        // Add the elements of the set to the result array
        for (int num : set) {
            result[index++] = num;
        }
        return result;  // return the final result array
    }
}
