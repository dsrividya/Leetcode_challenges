class Solution {
    public void sortColors(int[] nums) {

        int left = 0;

        // Move 0s to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
            }
        }

        int right = nums.length - 1;

        // Move 2s and above to the end
        for (int i = nums.length - 1; i >= left; i--) {
            if (nums[i] >= 2) {
                swap(nums, i, right);
                right--;
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
