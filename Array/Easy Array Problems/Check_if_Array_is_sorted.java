public class Check_if_Array_is_sorted {
    public static boolean isSorted(int[] arr, int n) {
        for(int i=1;i<n;i++) 
        { 
            if(arr[i] < arr[i-1]) 
            { 
                 // If the current element is less than the previous element, the array is not sorted
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {43,12,72,1,5,3};
        int n = arr.length;
        boolean result = isSorted(arr,n);  
        if(!result) //if the result is true 
           System.out.println("Not a Sorted Array");
        else
           System.out.println("Sorted Array");
           
    }
}

// Input : [43,12,72,1,5,3]
// Output : Not a Sorted Array