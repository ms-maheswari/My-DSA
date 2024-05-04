

// The problem is given an array  arr = [4,1,2,3,1] and a target is target = 5. 

// We have to find the index of the element who sum is equal to the given target.

// That is if we add the element 4 and 1 we have the sum of 5 which is equal to target

// Then return the index of the element 4 and 1 


public class Two_Sum {
    public static void main(String[] args) {
       int[] arr = {4, 1, 2, 3, 1};
       int n = arr.length;

       int target = 5;

    //    Call the twoSum method to find the index of the element whose sum is equal to target
       int[] result = twoSum(arr, n, target);
       for(int i:result){
            System.out.print(result[i] +" ");
     
       }
      
    }

    // Method to find the index of the element whose sum is equal to target

    private static int[] twoSum(int[] nums, int n, int target) {
         // Iterate over the array elements
         for (int i = 0; i < n; i++) {
            // Iterate over the array elements starting from i+1 to find a pair
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the elements at indices i and j equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the elements that add up to the target
                    return new int[] {i, j};
                }
            }
        }
        // If no pair is found, return an empty array
        return new int[] {};
    }
}


// Output

// 0 1
