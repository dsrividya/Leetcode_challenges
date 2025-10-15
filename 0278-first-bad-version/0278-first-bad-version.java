/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        
        while (left < right) { 
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                right = mid; // The first bad version is at `mid` or before it.
            } else {
                left = mid + 1; // The first bad version is after `mid`.
            }
        }
        
        return left; // When left == right, it is the first bad version.
    }
}
