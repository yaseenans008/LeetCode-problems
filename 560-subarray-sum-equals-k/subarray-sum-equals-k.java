class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> sumCount=new HashMap<>();
      sumCount.put(0,1);
      int result=0;
      int prefixSum=0;
      for(int num:nums){
        prefixSum+=num;
        if(sumCount.containsKey(prefixSum-k)){
            result+=sumCount.get(prefixSum-k);
        }
        sumCount.put(prefixSum,sumCount.getOrDefault(prefixSum,0)+1);
      }
      return result;

    }
}

/*'''''' only prefix sum approach ''''''
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        // Prefix sum
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int count = 0;

        // Check every subarray
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum;

                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}*/