class Solution {
    public int missingNumber(int[] nums) {
       int arrSum=0;

       int totalSum=0;
       for(int i=0;i<nums.length;i++){
        arrSum+=nums[i];
       } 
       totalSum=nums.length * (nums.length+1)/2;
       return totalSum-arrSum;
    }
}