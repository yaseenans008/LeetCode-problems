class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the overflow edge case explicitly
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the final result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert numbers to negative long values to prevent overflow
        // Math.abs(Integer.MIN_VALUE) exceeds Integer.MAX_VALUE
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        // Efficiently subtract chunks of divisor multiplied by powers of 2
        while (dvd >= dvs) {
            long tempDivisor = dvs;
            int multiple = 1;

            // Shift left until doubling it again would exceed the remaining dividend
            while (dvd >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

           
            dvd -= tempDivisor;
            quotient += multiple;
        }

        return isNegative ? -quotient : quotient;
    }
}
