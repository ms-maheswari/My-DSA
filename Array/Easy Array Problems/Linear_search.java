// Searching an element in the array and return its respective index if it is present otherwise it will return -1

public class Linear_search {
    public static int search(int[] array, int element, int n) {
        for(int i=0;i<n;i++){
            if(array[i]==element){
                return i;
            }
        }
       return -1;
    }
    
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int target = 3;
        int n = arr.length;
        int result = search(arr, target, n);
        System.out.println("The element "+target+" is at index "+ result);
    } 
}

// Input : [1, 2, 3, 4, 5], element = 3
// Output : The element 3 is at index 2