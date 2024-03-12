import java.util.Scanner;

public class Left_rotate_by_d_place {
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

        // Create a result array of integer data type to store the array elements after left rotate 

        int[] result = leftRotate(arr, n, d);  // LeftRotate method is called here

        System.out.println("\nArray after " + d + " times of left rotation:");

        // Use for loop to print the array elements after the number of times of left rotation

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // Method where the left rotate takes place

    static int[] leftRotate(int[] arr, int n, int d) {

        for (int i = 0; i < d; i++) // This loop is to perform left rotate for d number of times
        { 
            int start = arr[0]; // Initialize start as 0th index

            for (int j = 0; j < n - 1; j++) // This loop is to perform left rotate by 1 place
            { 
                arr[j] = arr[j + 1]; // Shift the array elements by 1 place to the left
            }
            arr[n - 1] = start;  // Assign the start value to the last index of the array
        }

        return arr;
    }
}
