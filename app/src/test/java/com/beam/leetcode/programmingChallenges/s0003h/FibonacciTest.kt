package com.beam.leetcode.programmingChallenges.s0003h

import org.junit.Assert.assertEquals
import org.junit.Test

class FibonacciTest {
    private val fibonacci = Fibonacci()

    @Test
    fun case_1() {
        val n = 10
        val expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34"

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val n = -10
        val expected = ""

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }
}