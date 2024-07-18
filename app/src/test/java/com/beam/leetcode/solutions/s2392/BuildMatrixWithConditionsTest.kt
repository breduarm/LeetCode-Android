package com.beam.leetcode.solutions.s2392

import com.beam.leetcode.solutions.s2392h.BuildMatrixWithConditions
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class BuildMatrixWithConditionsTest {
    private val buildMatrixWithConditions = BuildMatrixWithConditions()

    @Test
    fun case_1() {
        val k = 3
        val rowConditions = arrayOf(intArrayOf(1, 2), intArrayOf(3, 2))
        val colConditions = arrayOf(intArrayOf(2, 1), intArrayOf(3, 2))
        val expected = arrayOf(intArrayOf(0, 0, 1), intArrayOf(3, 0, 0), intArrayOf(0, 2, 0))

        val result = buildMatrixWithConditions.solve(k, rowConditions, colConditions)

        assertArrayEquals(expected, result)
    }

    @Test
    fun case_2() {
        val k = 3
        val rowConditions =
            arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 1), intArrayOf(2, 3))
        val colConditions = arrayOf(intArrayOf(2, 1))
        val expected = emptyArray<Array<IntArray>>()

        val result = buildMatrixWithConditions.solve(k, rowConditions, colConditions)

        assertArrayEquals(expected, result)
    }
}