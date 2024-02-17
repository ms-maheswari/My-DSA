import java.util.Scanner;

public class Second_largest_Element {
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

        // Call the Second_largest method to find the second largest element
        int second_lg = Second_largest(array, n);
        System.out.println("\nSecond largest element is "+ second_lg);
    }

    private static int Second_largest(int[] array, int n) {
       int large = array[0];
       int second_lg = Integer.MIN_VALUE;

       // Iterate through the array to find the second largest element

       for(int i=0;i<n;i++){
        if(array[i]>large){
            second_lg = large;
            large = array[i];
        }
        else if(array[i] > second_lg && array[i] < large){
            second_lg = array[i];
        }
       }
       return second_lg;
    }
}
