public class Frequency_of_Array {
    public static void  ArrayElementFrequency(int arr[], int n){
        for(int i=0;i<n;i++){
            boolean visited = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    visited = true;
                    break;
                }
            }
            if(!visited){
                int count = 1;
                for(int k=i+1;k<n;k++){
                    if(arr[i] == arr[k]){
                        count++;
                    }
                }
                System.out.println(arr[i]+ " occurs "+count);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 1, 2};
        int n = arr.length;
        ArrayElementFrequency(arr, n);
    }
}


// Input : [1, 3, 2, 3, 4, 1, 1, 2]

// Output:

// 1 occurs 3
// 3 occurs 2
// 2 occurs 2
// 4 occurs 1