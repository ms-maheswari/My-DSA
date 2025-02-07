public class Majority_Element {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int max = majorityElement(arr, n);
        System.out.println(max);
    }
    public static int majorityElement(int arr[], int n){
        int candidate = arr[0];
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == candidate){
                count++;
            }
            else{
                count--;
                if(count==0){
                    candidate = arr[i];
                    count = 1;
                }
            } 
        }
        return candidate;
    }
}
