import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
     
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Length of the arrays
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Call Intersection method to find the common elements between two arrays
        int[] result = Intersection(arr1, arr2, n1, n2);  

        // Loop to print the result 
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");  // Print intersection elements
        }
    }

    // Method to find the intersection of two sorted arrays
    static int[] Intersection(int[] a, int[] b, int n, int m) {

        // Declare a HashSet of Integer type to store unique elements from the first array
        Set<Integer> set = new HashSet<>();

        // Declare an ArrayList to store common elements found between the two arrays
        List<Integer> list = new ArrayList<>();

        // Traverse the first array and add its elements to the HashSet
        for(int i = 0; i < n; i++){
            set.add(a[i]);  // Adding unique elements from array 'a' to the HashSet
        }

        // Traverse the second array and check if elements are present in the HashSet
        for(int i = 0; i < m; i++){
            if(set.contains(b[i])){  // If element from array 'b' exists in the HashSet
                list.add(b[i]);      // Add common element to the ArrayList
                set.remove(b[i]);    // Remove the element from the HashSet to avoid duplicates
            }
        }

        // Create an array to store the result, with the size equal to the size of the list
        int[] result = new int[list.size()];  

        // Initialize index for the result array
        int j = 0;  

        // Add the elements of the list to the result array
        for(int i : list){
            result[j] = i;  
            j++;  
        }

        // Return the result array containing the intersection of two arrays
        return result;
    }
}

// Input :
// arr1 = {1, 2, 3, 4, 5}
// arr2 = {3, 4, 5, 6, 7}

// Output : 3 4 5
