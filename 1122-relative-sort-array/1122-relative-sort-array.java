class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of arr1
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Place elements based on arr2 order
        for (int num : arr2) {
            int count = freq.get(num);
            while (count-- > 0) {
                arr1[index++] = num;
            }
            freq.remove(num);
        }

        // Sort remaining elements
        List<Integer> remaining = new ArrayList<>();
        for (int key : freq.keySet()) {
            int count = freq.get(key);
            while (count-- > 0) {
                remaining.add(key);
            }
        }

        Collections.sort(remaining);

        // Append remaining
        for (int num : remaining) {
            arr1[index++] = num;
        }

        return arr1;
    }
}
