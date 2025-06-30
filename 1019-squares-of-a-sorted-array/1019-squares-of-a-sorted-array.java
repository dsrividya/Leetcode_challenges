import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        // Step 1: Square each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: Sort the squared array
        Arrays.sort(nums);

        // Step 3: Return the result
        return nums;
    }
}
