package com.beam.leetcode.solutions.s0005m

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestPalindromeSubstringTest {
    private val longestPalindromeSubstring = LongestPalindromeSubstring()

    @Test
    fun case_1() {
        val s = "babad"
        val expected = "aba"

        val result = longestPalindromeSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val s = "cbbd"
        val expected = "bb"

        val result = longestPalindromeSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val s = ""
        val expected = ""

        val result = longestPalindromeSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val s = "c"
        val expected = "c"

        val result = longestPalindromeSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val s = "fsadbvbrrsdasfgjbfsaf"
        val expected = "bvb"

        val result = longestPalindromeSubstring.solve(s)

        assertEquals(expected, result)
    }
}