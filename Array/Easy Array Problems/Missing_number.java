public class Missing_number {
    public static int missedNumber(int arr[], int n){
        int sum =(n*(n+1))/2; //formula to find sum from 1 to n
        int arr_sum = 0;

        // Use for loop to calculate sum of array elements
        for(int i=0; i<n-1; i++){
            arr_sum += arr[i];
        }
        int result = sum - arr_sum;
        return result;
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 4, 5};
        int n = arr.length;
        int result = missedNumber(arr, n);    
        System.out.println("Missing number is "+result);
    }
}

// Input : [1, 2, 4, 5]
// Output : Missing number is 3