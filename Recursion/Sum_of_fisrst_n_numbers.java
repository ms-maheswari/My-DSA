import java.util.Scanner;

public class Sum_of_fisrst_n_numbers {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();

        // Calculate the sum of the first n natural numbers
        int result = sum(n);
        System.out.println(result);
     }

      // Method to calculate the sum of the first n natural numbers

    private static int sum(int n) {
        if(n<0) //If n is less than 0
        {
            return 0;
        }
        // Calculate the sum using the formula sum = n * (n + 1) / 2
        int sum = n*(n+1)/2;
        return sum;
    }
}
