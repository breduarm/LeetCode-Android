package com.beam.leetcode.solutions.s0027e

import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveElementTest {
    private val removeElement = RemoveElement()

    @Test
    fun case_1() {
        val nums = intArrayOf(3, 2, 2, 3)
        val `val` = 3
        val expectedK = 2
        val expectedNums = intArrayOf(2, 2)

        val result = removeElement.solve(nums, `val`)

        assertEquals(expectedK, result)

        for (i in 0..<result) {
            assertEquals(expectedNums[i], nums[i])
        }
    }

    @Test
    fun case_2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val `val` = 2
        val expectedK = 5
        val expectedNums = intArrayOf(0, 1, 4, 0, 3)

        val result = removeElement.solve(nums, `val`)

        assertEquals(expectedK, result)

        for (i in 0..<result) {
            assertEquals(expectedNums[i], nums[i])
        }
    }
}