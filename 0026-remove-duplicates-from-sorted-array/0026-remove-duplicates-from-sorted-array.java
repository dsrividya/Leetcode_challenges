class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0; // Index of last unique element found

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;          // Move to next unique position
                nums[uniqueIndex] = nums[i]; // Place the unique element here
            }
        }

        // uniqueIndex is index of last unique element,
        // so length of unique elements = uniqueIndex + 1
        return uniqueIndex + 1;
    }
}
