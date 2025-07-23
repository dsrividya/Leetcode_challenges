class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int m = word1.length(), n = word2.length();

        // Merge characters alternately
        while (i < m && j < n) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // Append remaining characters (if any)
        while (i < m) result.append(word1.charAt(i++));
        while (j < n) result.append(word2.charAt(j++));

        return result.toString();
    }
}
