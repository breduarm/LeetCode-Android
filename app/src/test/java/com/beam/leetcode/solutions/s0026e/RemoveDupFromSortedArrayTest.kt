package com.beam.leetcode.solutions.s0026e

import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveDupFromSortedArrayTest {
    private val removeDupFromSortedArray = RemoveDupFromSortedArray()

    @Test
    fun case_1() {
        val nums = intArrayOf(1, 1, 2)
        val expected = 2

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 4)
        val expected = 5

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expected, result)
    }
}