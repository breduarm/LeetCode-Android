package com.beam.leetcode.solutions.easy.e0009

import org.junit.Assert.assertEquals
import org.junit.Test

class PalindromeTest {
    private val palindrome = Palindrome()

    @Test
    fun check_0_is_palindrome() {
        val x = 0
        val expected = true

        val result = palindrome.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun check_negative_int_is_not_palindrome() {
        val x = -121
        val expected = false

        val result = palindrome.solve(x)

        assertEquals(expected, result)
    }

    @Test
    fun check_121_is_palindrome() {
        val x = 121
        val expected = true

        val result = palindrome.solve(x)

        assertEquals(expected, result)
    }
}