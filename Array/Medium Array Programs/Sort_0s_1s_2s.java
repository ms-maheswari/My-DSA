public class Sort_0s_1s_2s {
    public static int[] Sort(int[] arr, int n) {
        int c0 = 0; // count of 0 is initialized to 0
        int c1 = 0; // count of 1 is initialized to 0
        int c2 = 0; // count of 2 is initialized to 0
        
        for(int i=0;i<n;i++){
            if(arr[i] == 0) 
               c0++;
            else if(arr[i] == 1)
               c1++;
            else
               c2++;
        }
        
        for(int j = 0 ; j < c0 ; j++) //loop to print the 0s in the array
           arr[j] = 0;
        
        for(int j = c0 ; j< c0 + c1 ; j++) // loop to print the 1 after the 0s in the array
           arr[j] = 1;
        
        for(int j = c0 + c1; j < n ; j++) //loop to print the 2 after the 0s and 1s in the array
           arr[j] = 2;

           return arr; //finally return the resultant array
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,1,2,0};
        int n = arr.length; 
        int[] result = Sort( arr, n); 
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }   
}

// Input : [1,0,2,0,1,2,0]
// Output : 0 0 0 1 1 2 2 