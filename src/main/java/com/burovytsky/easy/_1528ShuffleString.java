package com.burovytsky.easy;

/**
 * Given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i]
 * in the shuffled string.
 * Return the shuffled string.
 *
 * Example 1:
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */

public class _1528ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] str = s.toCharArray();
        char[] rsl = new char[str.length];
        for (int i = 0; i < indices.length; i++) {
            rsl[indices[i]] = (str[i]);
        }
        return new String(rsl);
    }
}
