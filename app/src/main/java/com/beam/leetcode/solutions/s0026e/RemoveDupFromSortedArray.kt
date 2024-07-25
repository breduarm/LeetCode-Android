package com.beam.leetcode.solutions.s0026e

class RemoveDupFromSortedArray {

    fun solve(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var nonDuplicateCount = 1

        for (i in 1..< nums.size) {
            if (nums[i - 1] != nums[i]) {
                nums[nonDuplicateCount] = nums[i]
                nonDuplicateCount++
            }
        }

        return nonDuplicateCount
    }
}