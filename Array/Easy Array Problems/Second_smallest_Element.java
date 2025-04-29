public class Second_smallest_Element {
    public static int Second_small(int[] array, int n) {
        int small = array[0];
        int second_small = Integer.MAX_VALUE;
 
        for(int i=0;i<n;i++){
         if(array[i]<small){
             second_small = small;
             small = array[i];
         }
         else if(array[i] < second_small && array[i] > small){
             second_small = array[i];
         }
        }
        return second_small;
     }
 
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int n = arr.length;
        int result = Second_small(arr, n);
        System.out.println("Second smallest element is "+result);
    } 
}

// Input : [2,5,1,3,0]
// Output : Second smallest element is 1