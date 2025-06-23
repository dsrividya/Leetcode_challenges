class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26]; // assuming only lowercase letters

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }

        // Check against ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a'] == 0) {
                return false;
            }
            letters[c - 'a']--;
        }

        return true;
    }
}
