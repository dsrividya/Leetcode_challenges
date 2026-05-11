import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        return Arrays.stream(nums)
                .mapToObj(String::valueOf)          // Convert each number to String
                .flatMapToInt(s -> s.chars()       // Stream of characters
                                     .map(c -> c - '0')) // Convert char → digit
                .toArray();
    }
}