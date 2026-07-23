class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefSum=0;
        int rem=0;
        for(int i=0;i<n;i++){
            prefSum=prefSum+nums[i];
            rem=prefSum%k;
            //handle negative no (optional)
            if (rem < 0) rem += k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            }
            else map.put(rem,i);
        }
        return false;

    }
}