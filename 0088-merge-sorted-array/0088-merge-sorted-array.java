

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create an array to store the merged result
        int[] k = new int[m + n];
        
        int i = 0, j = 0, c = 0;

        // Merge the two arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                k[c] = nums1[i];
                i++;
            } else {
                k[c] = nums2[j];
                j++;
            }
            c++;
        }

        // If there are any remaining elements in nums1
        while (i < m) {
            k[c] = nums1[i];
            i++;
            c++;
        }

        // If there are any remaining elements in nums2
        while (j < n) {
            k[c] = nums2[j];
            j++;
            c++;
        }

        // Copy the merged array into nums1
        System.arraycopy(k, 0, nums1, 0, m + n);
        
        // Print the merged array
        System.out.println(Arrays.toString(nums1));
    }
}
