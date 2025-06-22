class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the end
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, set to 0 and continue loop to handle carry
            digits[i] = 0;
        }

        // If we reached here, it means all digits were 9 (e.g., 999 + 1 = 1000)
        int[] result = new int[n + 1];
        result[0] = 1;  // All others are already 0 by default
        return result;
    }
}
