import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) { // Loop through each word in the array
            // Convert word to char array, sort it, and get sorted string
            char[] chars = word.toCharArray(); 
            Arrays.sort(chars);  // Sort the characters
            String sortedWord = new String(chars);  // Convert back to a string

            // If the sorted word is not in the map, add it with an empty list
            map.putIfAbsent(sortedWord, new ArrayList<>());

                 map.get(sortedWord).add(word);
        }

        // Return all groups of anagrams as a list
        return new ArrayList<>(map.values());
    }
}
            
            // Add
