class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> targetSum=new HashMap<>();
        int prefixSum=0;
        targetSum.put(0,1);
        int count=0;
        for(int num:nums){
            prefixSum+=num;
        if(targetSum.containsKey(prefixSum-goal)){
            count+=targetSum.get(prefixSum-goal);
        }
        targetSum.put(prefixSum,targetSum.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}