import java.util.Scanner;

public class Second_smallest_Element {
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

        // Call the Second_smallest method to find the second smallest element
        int second_small = Second_small(array, n);
        System.out.println("\nSecond smallest element is "+ second_small);
    }

    private static int Second_small(int[] array, int n) {
       int small = array[0];
       int second_small = Integer.MAX_VALUE;

       // Iterate through the array to find the second smallest element

       for(int i=0;i<n;i++){
        if(array[i]<small){
            second_small = small;
            small = array[i];
        }
        else if(array[i] < second_small && array[i] > small){
            second_small = array[i];
        }
       }
       return second_small;
    }

}
