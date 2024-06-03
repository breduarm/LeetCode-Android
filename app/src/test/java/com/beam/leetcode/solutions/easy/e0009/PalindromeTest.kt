package com.beam.leetcode.solutions.easy.e0009

import org.junit.Assert.assertEquals
import org.junit.Test

class PalindromeTest {

    @Test
    fun true_for_palindrome() {
        val x = 121
        val expected = true

        val result = Palindrome().solve(x)

        assertEquals(expected, result)
    }
}