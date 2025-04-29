public class Largest_Element  {
    public static int largeElement(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[] =  {2,5,1,3,0};
        int n = arr.length;
        int largeElement = largeElement(arr, n);
        System.out.println("The largest element is "+largeElement);
    }
}

// Input : [2,5,1,3,0]
// Output : The largest element is 5