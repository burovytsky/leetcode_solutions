package com.burovytsky.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Note:
 * Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
 * [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer
 * overflows.
 * <p>
 * Example 1:
 * Input: x = 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: x = -123
 * Output: -321
 */
public class _007ReverseInteger {
    public static int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
