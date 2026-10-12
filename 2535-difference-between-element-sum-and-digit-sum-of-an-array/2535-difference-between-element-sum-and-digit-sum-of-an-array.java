class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int mum=0;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
         for (int i=0;i<nums.length;i++){
           int p=nums[i];
           while(p>0){
           mum=mum+p%10;
           p=p/10;}}
           return Math.abs(sum-mum);
    }
}