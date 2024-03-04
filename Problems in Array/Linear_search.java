// Searching an element in the array and return its respective index if it is present otherwise it will return -1

import java.util.Scanner;

public class Linear_search {
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

        System.out.println("\nEnter the element to search ");

        int element = s.nextInt(); // Get the element to search
        int result = search(array, element,n); // Call the search function to find the index of the element
        if(result==(-1)){
            System.out.println("The element is not found");

        }
        else{
            System.out.println("\nThe element is present at the index" +result);
        }
       
    }

// Function to perform linear search in the array

    public static int search(int[] array, int element, int n) {
        for(int i=0;i<n;i++){
            if(array[i]==element){
                return i;
            }
        }
       return -1;
    }
}
