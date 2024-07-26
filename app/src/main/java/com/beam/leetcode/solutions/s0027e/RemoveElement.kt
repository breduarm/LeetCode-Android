package com.beam.leetcode.solutions.s0027e

class RemoveElement {

    fun solve(nums: IntArray, `val`: Int): Int {
        var diffCount = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[diffCount] = nums[i]
                diffCount++
            }
        }

        return diffCount
    }
}