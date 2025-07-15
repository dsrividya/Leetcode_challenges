class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        for (int i = 0; i < 31; i++) { // 2^30 is 1,073,741,824 — max for 32-bit signed int
            double power = Math.pow(2, i);
            if (power == n) {
                return true;
            }
            if (power > n) {  // No need to continue if 2^i exceeds n
                break;
            }
        }
        return false;
    }
}
