package com.beam.leetcode.solutions.s0001e

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TwoSumTest {
    private val twoSum = TwoSum()

    @Test
    fun case_1() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val (firstPosition, secondPosition) = twoSum.solve(nums, target)
        assertEquals(target, nums[firstPosition] + nums[secondPosition])
    }

    @Test
    fun case_2() {
        val nums = intArrayOf(3,2,4)
        val target = 6

        val (firstPosition, secondPosition) = twoSum.solve(nums, target)
        assertEquals(target, nums[firstPosition] + nums[secondPosition])
    }

    @Test
    fun case_3() {
        val nums = intArrayOf(3,3)
        val target = 6

        val (firstPosition, secondPosition) = twoSum.solve(nums, target)
        assertEquals(target, nums[firstPosition] + nums[secondPosition])
    }

    @Test
    fun case_4() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val (result, executionTime) = twoSum.solveWithMeasure(nums, target)
        val (firstPosition, secondPosition) = result

        assertEquals(target, nums[firstPosition] + nums[secondPosition])
        assertTrue(executionTime.isFinite())
    }
}