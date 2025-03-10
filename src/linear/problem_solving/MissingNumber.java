/*
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 * 
 * Link: https://leetcode.com/problems/missing-number/description/?source=submission-ac
 */

package linear.problem_solving;

public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int missing_number = n * (n + 1) / 2;

        for (int i : arr) {
            missing_number -= i;
        }

        return missing_number;
    }

}
