import java.util.Scanner;

public class Right_rotate_by_d_place {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Original array:");

        // Use a loop to print the original array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the number of times to rotate: ");
        int d = s.nextInt(); // Get input from the user for the number of times to rotate

        // Create a result array of integer data type to store the array elements after right rotate 

        int[] result = rightRotate(arr, n, d);  // rightRotate method is called here

        System.out.println("\nArray after " + d + " times of right rotation:");

        // Use for loop to print the array elements after the number of times of right rotation

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // Method where the right rotate takes place

    static int[] rightRotate(int[] arr, int n, int d) {

        for (int i = 0; i < d; i++) // This loop is to perform right rotate for d number of times
        { 
            int end = arr[n-1]; // Initialize end as last index

            for (int j = n-1; j > 0; j--) // This loop is to perform right rotate by 1 place
            { 
                arr[j] = arr[j - 1]; // Shift the array elements by 1 place to the right
            }
            arr[0] = end;  // Assign the end value to the start index of the array
        }

        return arr;
    }
}
