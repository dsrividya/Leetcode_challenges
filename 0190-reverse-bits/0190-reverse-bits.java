public class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // Shift result left to make room for the next bit
            result <<= 1;
            // Extract the rightmost bit of n and add it to result
            result |= (n & 1);
            // Shift n right to get the next bit
            n >>= 1;
        }

        return result;
    }
}
