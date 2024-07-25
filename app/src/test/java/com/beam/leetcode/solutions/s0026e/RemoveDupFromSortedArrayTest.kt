package com.beam.leetcode.solutions.s0026e

import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveDupFromSortedArrayTest {
    private val removeDupFromSortedArray = RemoveDupFromSortedArray()

    @Test
    fun case_1() {
        val nums = intArrayOf(1, 1, 2)
        val expectedK = 2
        val expectedNums = intArrayOf(1, 2)

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expectedK, result)

        for (i in 0..< result) {
            assertEquals(nums[i], expectedNums[i])
        }
    }

    @Test
    fun case_2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 4)
        val expectedK = 5
        val expectedNums = intArrayOf(0, 1, 2, 3, 4)

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expectedK, result)

        for (i in 0..< result) {
            assertEquals(nums[i], expectedNums[i])
        }
    }

    @Test
    fun case_3() {
        val nums = intArrayOf()
        val expectedK = 0
        val expectedNums = intArrayOf()

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expectedK, result)

        for (i in 0..< result) {
            assertEquals(nums[i], expectedNums[i])
        }
    }

    @Test
    fun case_4() {
        val nums = intArrayOf(1)
        val expectedK = 1
        val expectedNums = intArrayOf(1)

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expectedK, result)

        for (i in 0..< result) {
            assertEquals(nums[i], expectedNums[i])
        }
    }

    @Test
    fun case_5() {
        val nums = intArrayOf(0, 1, 2, 3, 4, 4, 4, 4, 4)
        val expectedK = 5
        val expectedNums = intArrayOf(0, 1, 2, 3, 4)

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expectedK, result)

        for (i in 0..< result) {
            assertEquals(nums[i], expectedNums[i])
        }
    }

    @Test
    fun case_6() {
        val nums = intArrayOf(0, 1, 1, 1, 1, 1, 1, 1, 4)
        val expectedK = 3
        val expectedNums = intArrayOf(0, 1, 4)

        val result = removeDupFromSortedArray.solve(nums)

        assertEquals(expectedK, result)

        for (i in 0..< result) {
            assertEquals(nums[i], expectedNums[i])
        }
    }
}