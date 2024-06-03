package com.beam.leetcode.solutions.s0001e

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TwoSumTest {

    @Test
    fun add_first_two_positions() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val (firstPosition, secondPosition) = TwoSum().solve(nums, target)
        assertEquals(target, nums[firstPosition] + nums[secondPosition])
    }

    @Test
    fun add_last_two_positions() {
        val nums = intArrayOf(3,2,4)
        val target = 6

        val (firstPosition, secondPosition) = TwoSum().solve(nums, target)
        assertEquals(target, nums[firstPosition] + nums[secondPosition])
    }

    @Test
    fun add_the_two_positions_of_an_array() {
        val nums = intArrayOf(3,3)
        val target = 6

        val (firstPosition, secondPosition) = TwoSum().solve(nums, target)
        assertEquals(target, nums[firstPosition] + nums[secondPosition])
    }

    @Test
    fun add_two_first_positions_and_execution_time_measured_is_finite() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val (result, executionTime) = TwoSum().solveWithMeasure(nums, target)
        val (firstPosition, secondPosition) = result

        assertEquals(target, nums[firstPosition] + nums[secondPosition])
        assertTrue(executionTime.isFinite())
    }
}