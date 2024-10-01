package com.beam.leetcode.globantDojo.s0001m

import org.junit.Assert.assertEquals
import org.junit.Test

class MaxPointsOnALineTest {
    private val maxPointsOnALine = MaxPointsOnALine()

    @Test
    fun case_1() {
        val points = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(2, 2),
            intArrayOf(3, 3)
        )
        val expected = 3

        val actual = maxPointsOnALine.solve(points)

        assertEquals(expected, actual)
    }

    @Test
    fun case_2() {
        val points = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(3, 2),
            intArrayOf(5, 3),
            intArrayOf(4, 1),
            intArrayOf(2, 3),
            intArrayOf(1, 4)
        )
        val expected = 4

        val actual = maxPointsOnALine.solve(points)

        assertEquals(expected, actual)
    }

    @Test
    fun case_3() {
        val points = arrayOf(
            intArrayOf(5, 7),
            intArrayOf(1, 1),
            intArrayOf(2, 1),
            intArrayOf(2, 2),
            intArrayOf(6, 6),
            intArrayOf(3, 3)
        )
        val expected = 4

        val actual = maxPointsOnALine.solve(points)

        assertEquals(expected, actual)
    }

    @Test
    fun case_4() {
        val points = arrayOf(
            intArrayOf(5, 1),
            intArrayOf(5, 3),
            intArrayOf(5, 9),
            intArrayOf(6, 1),
        )
        val expected = 3

        val actual = maxPointsOnALine.solve(points)

        assertEquals(expected, actual)
    }
}