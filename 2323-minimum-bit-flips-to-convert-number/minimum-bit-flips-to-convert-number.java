class Solution {
    public int minBitFlips(int start, int goal) {
       int exclusive=start^goal;
       int count=0;
       while(exclusive!=0){
        if((exclusive & 1)==1) count++;
        exclusive=exclusive>>1;
       }
        /* we can also use count=0;
        while(exclusive!=0){
        exclusive=exclusive&(exclusive-1) // this makes rightmost bit set to 0 
        count ++ ;
        } */
       return count;
    }
}