class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
         int n = nums.length;
         int subsets = 1<<n;
        for(int i=0;i<subsets;i++){ 
             List<Integer> subset = new ArrayList<>();
            // Iterate through each bit of the number
            for (int j = 0; j < n; j++) {
                // If ith bit is set, include nums[i] in the subset
                if(((i>>j)&1)==1){
                    subset.add(nums[j]);
                }
            }
            // Add this subset into the final result
            ans.add(subset);
        }
        // Return all subsets
        return ans;
    }
}