import java.util.LinkedList;

class Solution {
    public int longestPalindrome(String s) {
        LinkedList<Character> list = new LinkedList<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (list.contains(c)) {
                list.remove((Character) c); // remove the paired character
                count += 2; // one pair found
            } else {
                list.add(c); // add unpaired character
            }
        }

        // If any characters left, we can place one in the middle
        if (!list.isEmpty()) {
            count += 1;
        }

        return count;
    }
}
