import java.util.Arrays;

public class Check_two_arrays_equal {
    public static void main(String[] args) {
         // Initialize arrays
         int[] arr1 = {1, 3, 2, 4};
         int[] arr2 = {2, 3, 4, 1};
 
         // Sort arrays using build-in function
         Arrays.sort(arr1);
         Arrays.sort(arr2);
 
         // Print Array 1 elements
         System.out.println("Array 1:");
         for (int i = 0; i < arr1.length; i++) {
             System.out.print(arr1[i] + " ");
         }
 
         // Print Array 2 elements
         System.out.println("\nArray 2:");
         for (int i = 0; i < arr2.length; i++) {
             System.out.print(arr2[i] + " ");
         }
 
         // Check if arrays are equal
         boolean isEqual = Arrays.equals(arr1, arr2);
 
         // Print the result
         if (isEqual) {
             System.out.println("\nArrays are equal");
         } else {
             System.out.println("\nArrays are not equal");
         }
     }
 }