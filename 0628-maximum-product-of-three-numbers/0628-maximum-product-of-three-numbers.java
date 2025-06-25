import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // Top 3 largest
        int option2 = nums[0] * nums[1] * nums[n - 1];         // Two smallest & the largest

        return Math.max(option1, option2);
    }
}
