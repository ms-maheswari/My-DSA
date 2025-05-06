public class Right_Rotate {
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

    static void rightRotate(int arr[], int k, int n) {
        // Reverse first n-k elements
        reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        reverse(arr, n - k, n - 1);
        // Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;
        rightRotate(arr, k, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

// Input : [1, 2, 3, 4, 5, 6, 7], k = 3

// Output : 5 6 7 1 2 3 4
