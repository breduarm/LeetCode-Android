package com.beam.leetcode.solutions.s0026e

class RemoveDupFromSortedArray {

    fun solve(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var nextIndexFree = 0
        var nonDuplicateCount = 1

        for (i in 1..<nums.size) {
            if (nums[i - 1] == nums[i] || nums[i] < nums[i - 1]) {
                if (nextIndexFree == 0) nextIndexFree = i
            } else {
                if (nextIndexFree > 0) {
                    nums[nextIndexFree] = nums[i]
                    nextIndexFree++
                }
                nonDuplicateCount++
            }
        }

        return nonDuplicateCount
    }
}