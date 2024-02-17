import java.util.Scanner;

public class Largest_Element  {
    public static void main(String[] args){
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
        
        int large = array[0]; //initialize array[0] element is large

        // Use a loop to compare the large with all other array elements to find the largest element 

        for(int i=0;i<n;i++){
            if(array[i]>large){
                large = array[i];
            }

        }
        System.out.println("\nLargest element is " + large);
    }
}
