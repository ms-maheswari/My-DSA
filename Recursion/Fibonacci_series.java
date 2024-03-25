import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt(); // Get the input n value

        int result[] = fibonacci(n); // Call the method fibonacci to find the result
        System.out.println("Result is ");
        // loop to print the output
        for(int i=0;i<=n;i++){
            System.out.println(result[i]);
        }
    }

    // Method to generate Fibonacci series up to the nth term
    private static int[] fibonacci(int n) {
       int[] fibonacci = new int[n+1]; // Array to store Fibonacci series
       int n1 = 0; // Initialize the first number as 0
       int n2 = 1; // Initialize the second number as 1
       fibonacci[0] = n1; // Assign the 0th index as value 0

       // Loop to find the Fibonacci series up to the n value
       for(int i=1;i<=n;i++) { 
            fibonacci[i] = n2;
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
       }
       return fibonacci; // Return the Fibonacci series array
    }
}
