class Solution {
    public int divide(int dividend, int divisor) {
      
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long y = Math.abs((long) dividend);
        long z = Math.abs((long) divisor);
        int result = 0;

        while (y >= z) {
            long temp = z, multiple = 1;
            while (y >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            y -= temp;
            result += multiple;
        }

        
        return ((dividend > 0) ^ (divisor > 0)) ? -result : result;
    }
}