class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length; 
int maxSum = Integer.MIN_VALUE; 
 
            int currentSum = 0; 
 
            for (int j = 0; j < n; j++) { 
             currentSum = Math.max(nums[j], currentSum + nums[j]);
                maxSum = Math.max(maxSum, currentSum); 
            
        }
 
        return maxSum; 
 
    }
}