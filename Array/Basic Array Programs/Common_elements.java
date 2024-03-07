public class Common_elements {
    public static void main(String[] args) {
        // Define three arrays
        int[] A = {1,2,3,4,5};
        int[] B = {4,5,6,7,0};
        int[] C = {5,1,3,8,9};

        // Get the lengths of the arrays
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;

        // Find the common element
        int result = common_element(A, B, C, n1, n2, n3);

        // Print the result
        if (result != -1) {
            System.out.println("Common element is " + result);
        } else {
            System.out.println("No common element found.");
        }
    }

    // Function to find the common element among three arrays
    private static int common_element(int[] a, int[] b, int[] c, int n1, int n2, int n3) {
        // Initialize pointers for the three arrays
        int i = 0, j = 0, k = 0;

        // Iterate through the arrays
        while (i < n1 && j < n2 && k < n3) {
            // If elements are equal, return the common element
            if (a[i] == b[j] && a[i] == c[k]) {
                return a[i];
            }

            // Using while loop to skip the duplicates in the array
            while (i + 1 < n1 && a[i] == a[i + 1]) {
                i++;
            }
            while (j + 1 < n2 && b[j] == b[j + 1]) {
                j++;
            }
            while (k + 1 < n3 && c[k] == c[k + 1]) {
                k++;
            }

            // Move pointers forward based on the comparison of elements
            if (a[i] < b[j] || a[i] < c[k]) {
                i++;
            } else if (b[j] < a[i] || b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }

        return -1; // No common element found
    }
}
