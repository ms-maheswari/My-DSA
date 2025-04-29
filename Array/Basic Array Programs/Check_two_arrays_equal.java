public class Check_two_arrays_equal {

    // Method to sort the array elements (Selection Sort)
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to check whether both arrays are equal
    public static boolean isEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length)
            return false;
        sort(arr1);
        sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 2, 4 };
        int[] arr2 = { 2, 3, 4, 1 };
        boolean result = isEqual(arr1, arr2);
        if (result) {
            System.out.print("Equal Arrays");
        } else {
            System.out.print("Not equal arrays");
        }
    }
}

// Input : [1, 3, 2, 4], [2, 3, 4, 1]
// Ouput : Equal Arrays