class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;  // convert value to index
            if (nums[index] > 0) {
                nums[index] = -nums[index];     // mark as visited
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);              // index + 1 is missing
            }
        }
        return result;
    }
}
