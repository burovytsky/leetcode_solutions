package com.burovytsky.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */
public class _003LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int rsl = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int forSize = s.length();
        for (int i = 0; i < forSize; i++) {
            if (map.putIfAbsent(s.charAt(i), i) != null) {
                maxLength = Math.max(rsl, maxLength);
                i = map.get(s.charAt(i)) + 1;
                forSize = s.length();
                rsl = 1;
                map.clear();
                map.put(s.charAt(i), i);
            } else {
                rsl++;
            }
        }
        maxLength = Math.max(rsl, maxLength);

        return maxLength;
    }
}
