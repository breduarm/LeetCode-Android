package com.beam.leetcode.solutions.easy.e0001

import org.junit.Assert.assertEquals
import org.junit.Test

class TwoSumTest {

    @Test
    fun add_first_two_positions() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val (firstPosition, secondPosition) = TwoSum().solve(nums, target)
        assertEquals(target, nums[firstPosition] + nums[secondPosition])
    }
}