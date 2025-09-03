class Solution {
    public int findComplement(int num) {
        // Step 1: Find the bit length of num
        int bitLength = Integer.toBinaryString(num).length();
        
        // Step 2: Create a mask with all 1’s of the same length
        int mask = (1 << bitLength) - 1;
        
        // Step 3: XOR with mask to flip bits
        return num ^ mask;
    }
}
