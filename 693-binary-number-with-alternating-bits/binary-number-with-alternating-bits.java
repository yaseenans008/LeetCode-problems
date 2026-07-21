class Solution {
    public boolean hasAlternatingBits(int n) {
     
    // Shifting by 1 aligns opposite bits (0 with 1, and 1 with 0)
    int xorShift = n ^ (n >> 1);
    
    // Check if xorShift is of the form 111...11
    // A number like 111 (7) plus 1 equals 1000 (8). 
    // 111 & 1000 always equals 0.
    return (xorShift & (xorShift + 1)) == 0;
    }
  }