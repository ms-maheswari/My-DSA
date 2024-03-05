import java.util.Scanner;

public class Print_1_to_N {

    // this is the main method
    public static void main(String[] args) {
        
        //Get the n value from the user
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the number ");
        int n = s.nextInt();

        System.out.println();

        // Call the printNumbers method and pass the user-input n value
        printNumbers(n); 
    }

   // Recursive method to print numbers from 1 to N
   public static void printNumbers(int n){
    // Base case: If n is less than or equal to 0, exit the recursion
    if(n <= 0){
        return;
    }
    
    // Recursive call with n-1 to print numbers in descending order
    printNumbers(n-1); 
    
    // Print the current value of n
    System.out.println(n);
}
}