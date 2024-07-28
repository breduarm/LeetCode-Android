package com.beam.leetcode.solutions.s0035e

import org.junit.Assert.assertEquals
import org.junit.Test

class SearchInsertPositionTest {
    private val searchInsertPosition = SearchInsertPosition()

    @Test
    fun case_1() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val expected = 2

        val actual = searchInsertPosition.solve(nums, target)

        assertEquals(expected, actual)
    }

    @Test
    fun case_2() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val expected = 1

        val actual = searchInsertPosition.solve(nums, target)

        assertEquals(expected, actual)
    }

    @Test
    fun case_3() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val expected = 4

        val actual = searchInsertPosition.solve(nums, target)

        assertEquals(expected, actual)
    }

    @Test
    fun case_4() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 4
        val expected = 2

        val actual = searchInsertPosition.solve(nums, target)

        assertEquals(expected, actual)
    }

    @Test
    fun case_5() {
        val nums = intArrayOf(2,7,8,9,10)
        val target = 9
        val expected = 3

        val actual = searchInsertPosition.solve(nums, target)

        assertEquals(expected, actual)
    }

    @Test
    fun case_6() {
        val nums = intArrayOf(2,7,8,9,10,12,15,16,20,22)
        val target = 7
        val expected = 1

        val actual = searchInsertPosition.solve(nums, target)

        assertEquals(expected, actual)
    }
}