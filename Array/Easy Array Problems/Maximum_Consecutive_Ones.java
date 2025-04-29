public class Maximum_Consecutive_Ones {
    public static int maximumConsecutiveOnes(int[] nums, int n){
        int sum = 0; 
        int count = 0; 
        for(int i=0;i<n;i++) 
        {
            if(nums[i]==1) 
            {
                count++; 
                sum = Math.max(sum, count); 
            }
            else{
                count = 0; 
            }
        }
        return sum; 
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1};
        int n = arr.length;
        int result = maximumConsecutiveOnes(arr, n); 
        System.out.println("Maximum consecutive ones are : "+result);
    }  
}

// Input : [1,1,1,0,1,1]
// Output : Maximum consecutive ones are : 3