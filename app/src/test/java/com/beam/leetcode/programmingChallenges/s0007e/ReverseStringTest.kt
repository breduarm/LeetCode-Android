package com.beam.leetcode.programmingChallenges.s0007e

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseStringTest {
    private val reverseString = ReverseString()

    @Test
    fun case_1() {
        val s = "Hello world"
        val expected = "dlrow olleH"
        val result = reverseString.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val s = ""
        val expected = ""
        val result = reverseString.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val s = "     hello     "
        val expected = "     olleh     "
        val result = reverseString.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val s = "a"
        val expected = "a"
        val result = reverseString.solve(s)

        assertEquals(expected, result)
    }
}