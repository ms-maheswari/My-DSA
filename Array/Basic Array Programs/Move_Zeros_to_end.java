class Move_Zeros_to_end{
    public static void main(String[] args) {
        
        int[] arr = {1,0,2,0,0,3,4,0};
        
        int n = arr.length; // size of the array
        System.out.println("Original array ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        int j = -1;
        // Find the index of the first zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is present

        if(j == -1){
            System.out.println();
        }
        
        else{
            for (int i = j + 1; i < n; i++) {
                if (arr[i] != 0) {
                    // Swap the elements manually
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }

        // Move non-zero elements to the left of zeros
        
       System.out.println("\nResultant array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}