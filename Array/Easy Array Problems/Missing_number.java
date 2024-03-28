import java.util.Scanner;

public class Missing_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        // Get the size of the array
        int n = s.nextInt();

        // Create an array and initialize the size
        int[] array = new int[n];

        System.out.println("Enter the array elements: ");

        // Use a loop to get the array elements
        for (int i = 0; i < n-1; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("Elements of the array:");

        // Use a loop to print the array elements
        for (int i = 0; i < n-1; i++) {
            System.out.print(array[i] + " ");
        }

        int sum =(n*(n+1))/2; //formula to find sum from 1 to n
        int arr_sum = 0;

        // Use for loop to calculate sum of array elements
        for(int i=0;i<n;i++){
            arr_sum+=array[i];
        }
        
        int result = sum - arr_sum;
        System.out.println("\nMissing number is "+result);
    }
}
