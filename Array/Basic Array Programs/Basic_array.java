import java.util.Scanner;

class BasicArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        // Get the size of the array
        int size = s.nextInt();

        // Create an array and initialize the size
        int[] array = new int[size];

        System.out.println("Enter the array elements: ");

        // Use a loop to get the array elements
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("Elements of the array:");

        // Use a loop to print the array elements
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
