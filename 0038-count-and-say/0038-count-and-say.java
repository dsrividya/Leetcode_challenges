class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";  // base case

        String current = "1";  // first term
        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;

            for (int j = 1; j < current.length(); j++) {
                if (current.charAt(j) == current.charAt(j - 1)) {
                    count++;  // same digit, increase count
                } else {
                    next.append(count).append(current.charAt(j - 1)); // append count + digit
                    count = 1;  // reset count for new digit
                }
            }
            // append the last counted digit
            next.append(count).append(current.charAt(current.length() - 1));
            current = next.toString();  // move to next term
        }

        return current;
    }
}
