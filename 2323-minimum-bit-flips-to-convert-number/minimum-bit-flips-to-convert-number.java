class Solution {
    public int minBitFlips(int start, int goal) {
       int exclusive=start^goal;
       int count=0;
       while(exclusive!=0){
        if((exclusive & 1)==1) count++;
        exclusive=exclusive>>1;
       } 
       return count;
    }
}