class Solution {
    public int minChanges(int n, int k) {
        int ans=0;
        while(n > 0 || k > 0){
            int nBit = n & 1;
            int kBit = k & 1;
            if (nBit == 0 && kBit == 1) {
                return -1; 
            }
            if (nBit == 1 && kBit == 0) {
                ans++; // Need to flip this bit
            }
            k=k>>1;
            n=n>>1;
        }
        return ans;
    }
}