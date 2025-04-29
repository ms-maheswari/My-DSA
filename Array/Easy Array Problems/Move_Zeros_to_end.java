class Move_Zeros_to_end{
    // Using two pointers approach
    public static void movezero(int arr[], int n){
        int j = 0;
        for(int i=0; i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {    
        int[] arr = {1,0,2,0,0,3,4,0};
        int n = arr.length; 
        movezero(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }   
    }
}

// Input : [1,0,2,0,0,3,4,0]
// Output : 1 2 3 4 0 0 0 0 