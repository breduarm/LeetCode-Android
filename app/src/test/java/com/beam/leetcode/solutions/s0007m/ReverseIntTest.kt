package com.beam.leetcode.solutions.s0007m

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseIntTest {
    private val reverseInt = ReverseInt()

    @Test
    fun case_1() {
        val x = 123
        val expected = 321

        val result = reverseInt.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val x = -123
        val expected = -321

        val result = reverseInt.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val x = 120
        val expected = 21

        val result = reverseInt.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val x = 1534236469
        val expected = 0

        val result = reverseInt.solve(x)

        assertEquals(expected, result)
    }
}