package com.beam.leetcode.solutions.s0009e

import org.junit.Assert.assertEquals
import org.junit.Test

class PalindromeTest {
    private val palindrome = Palindrome()

    @Test
    fun case_1() {
        val x = 0
        val expected = true

        val result = palindrome.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val x = -121
        val expected = false

        val result = palindrome.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val x = 121
        val expected = true

        val result = palindrome.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val x = 10
        val expected = false

        val result = palindrome.solve(x)

        assertEquals(expected, result)
    }
}