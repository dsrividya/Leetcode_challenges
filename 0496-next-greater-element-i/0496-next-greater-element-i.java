class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int current = nums1[i];
            int next = -1;

            // Find index of nums1[i] inside nums2
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == current) {
                    index = j;
                    break;
                }
            }

            // Scan right side of nums2
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[k] > current) {
                    next = nums2[k];
                    break;
                }
            }

            result[i] = next;
        }

        return result;
    }
}
