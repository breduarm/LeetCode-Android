package com.beam.leetcode.solutions.s0035e

class SearchInsertPosition {

    fun solve(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (right + left) / 2

            when {
                nums[mid] == target -> return mid // If the target is found, return its index
                nums[mid] < target -> left = mid + 1 // the target is in the right half
                else -> right = mid - 1 // the target is in the left half
            }
        }

        // If the target is not found, return the index where it should be inserted
        return left
    }
}