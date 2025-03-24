package edu.netcracker.small_learning_things.leetcode.remove_duplicates_from_sorted_array_ii;

/**
 * @author svku0919
 * @version 19.06.2023-15:25
 */

class Solution {
    public static int removeDuplicates(int[] nums) {
        int currIndex = 0;
        int lastElem = nums[0];
        int amount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != lastElem) {
                amount = 0;
                lastElem = nums[i];
                for (int j = currIndex, k = 0; j < i; j++, k++) {
                    nums[j] = nums[i + k];
                }
                i = currIndex;
            } else if (nums[i] > lastElem) {
                if (amount < 2) {
                    amount++;
                    currIndex++;
                }
            }
        }

        return currIndex;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        removeDuplicates(nums);
        System.out.println(nums);
    }
}
