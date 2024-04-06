public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1};
        int n = arr.length;
        int result = maximumConsecutiveOnes(arr, n); //Call the method to find the maximum consecutive ones in the array
        System.out.println("Maximum consecutive ones are : "+result);
    }

    // Method to find the maximum consecutive ones in the array
    public static int maximumConsecutiveOnes(int[] nums, int n){
        int sum = 0; //Initialize the sum as 0
        int count = 0; //Initialize the count of 1s as 0
        for(int i=0;i<n;i++) // Iterate through the array 
        {
            if(nums[i]==1) // Check if 1 is in the array or not
            {
                count++; // If present, increase count by 1
                sum = Math.max(sum, count); // Find the maximum count 
            }
            else{
                count = 0; //If 1 is not present, reset count to 0
            }
        }
        return sum; // Return the maximum consecutive ones
    }
}
