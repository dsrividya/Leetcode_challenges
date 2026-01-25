class Solution {
    public int minimumDifference(int[] nums, int k) {

        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums); // REQUIRED

        int x = Integer.MAX_VALUE;

        // similar nested-loop thinking, but corrected
        for (int i = 0; i <= nums.length - k; i++) {
            int l = nums[i + k - 1] - nums[i];
            x = Math.min(x, l);
        }

        return x;
    }
}