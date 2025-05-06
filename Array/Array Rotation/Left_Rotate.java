public class Left_Rotate {
     // Function to Reverse the array
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int arr[], int k, int n) {

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse last n-k elements
        reverse(arr, k, n - 1);

        // Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        int n = arr.length;
        leftRotate(arr, k, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Input : [1, 2, 3, 4, 5, 6, 7], k = 2

// Output : 3 4 5 6 7 1 2 
