class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Move left pointer until it points to a letter
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            // Move right pointer until it points to a letter
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }

            // Swap letters
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
