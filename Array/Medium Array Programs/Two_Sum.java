public class Two_Sum {
    public static int[] twoSum(int[] nums, int n, int target) {
        for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               if (nums[i] + nums[j] == target) {
                   return new int[] {i, j};
               }
           }
       }
       // If no pair is found, return an empty array
       return new int[] {};
   }
    public static void main(String[] args) {
       int[] arr = {4, 1, 2, 3, 1};
       int n = arr.length;
       int target = 5;

       int[] result = twoSum(arr, n, target);
       for(int i:result){
            System.out.print(result[i] +" ");
       }
    }
}

// Input : [4, 1, 2, 3, 1]
// Output : 0 1
