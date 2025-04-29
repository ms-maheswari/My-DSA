public class Second_largest_Element {
    public static int Second_largest(int[] arr, int n) {
        int large = arr[0];
        int second_lg = Integer.MIN_VALUE;
 
        for(int i=0;i<n;i++){
         if(arr[i]>large){
             second_lg = large;
             large = arr[i];
         }
         else if(arr[i] > second_lg && arr[i] < large){
             second_lg = arr[i];
         }
        }
        return second_lg;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int n = arr.length;
        // Call the Second_largest method to find the second largest element
        int second_lg = Second_largest(arr, n);
        System.out.println("Second largest element is "+ second_lg);
    }
}

// Input : [2,5,1,3,0]
// Output : Second largest element is 3