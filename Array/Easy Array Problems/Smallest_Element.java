public class Smallest_Element  {
    public static int smallElement(int arr[], int n){
        int small = Integer.MAX_VALUE;
        for(int i=0; i<n ;i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args){
        int arr[] =  {2,5,1,3,0};
        int n = arr.length;
        int largeElement = smallElement(arr, n);
        System.out.println("The Smallest element is "+largeElement);
    }
}

// Input : [2,5,1,3,0]
// Output : Smallest element is 0
