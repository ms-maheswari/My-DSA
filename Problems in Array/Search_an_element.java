import java.util.Scanner;

public class Search_an_element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        // Get the size of the array
        int n = s.nextInt();

        // Create an array and initialize the size
        int[] array = new int[n];

        System.out.println("Enter the array elements: ");

        // Use a loop to get the array elements
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("Elements of the array:");

        // Use a loop to print the array elements
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nEnter the element to search ");
        int x = s.nextInt();

         // Call the searchElement method to search the element in the array
        search_element(array,n,x);
    }

    private static void search_element(int[] array, int n, int x) {
        boolean found = false;
        // Iterate through the loop to find whether the given element is present in the array or not
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                System.out.println("The element " + x + " is present at the index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("The element " + x + " is not found in the array.");
        }
    }
}
