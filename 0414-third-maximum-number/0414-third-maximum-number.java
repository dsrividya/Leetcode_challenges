import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Use a TreeSet to keep unique numbers sorted automatically
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                // Remove the smallest if more than 3 elements to keep top 3 max
                set.pollFirst();
            }
        }
        
        // If we have less than 3 unique numbers, return the max (last element)
        if (set.size() < 3) {
            return set.last();
        } else {
            // Return the 3rd max (smallest in the TreeSet when size is 3)
            return set.first();
        }
    }
}
