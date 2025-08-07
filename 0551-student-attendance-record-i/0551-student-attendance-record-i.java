class Solution {
    public boolean checkRecord(String s) {
        int absents = 0;
        int lateCount = 0;

        for (int i = 0; i < s.length(); i++) {
            // Count absents
            if (s.charAt(i) == 'A') {
                absents++;
                if (absents >= 2) return false;
            }

            // Check for continuous L's
            if (s.charAt(i) == 'L') {
                lateCount++;
                if (lateCount >= 3) return false;
            } else {
                lateCount = 0;  // reset count if not 'L'
            }
        }

        return true;
    }
}
