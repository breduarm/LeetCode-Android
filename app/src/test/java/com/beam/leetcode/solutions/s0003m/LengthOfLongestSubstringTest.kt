package com.beam.leetcode.solutions.s0003m

import org.junit.Assert.assertEquals
import org.junit.Test

class LengthOfLongestSubstringTest {
    private val lengthOfLongestSubstring = LengthOfLongestSubstring()

    @Test
    fun case_1() {
        val s = "abcabcbb"
        val expected = 3

        val result = lengthOfLongestSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val s = "bbbbb"
        val expected = 1

        val result = lengthOfLongestSubstring.solve(s)

        assertEquals(expected, result)
    }
    @Test
    fun case_3() {
        val s = "pwwkew"
        val expected = 3

        val result = lengthOfLongestSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val s = ""
        val expected = 0

        val result = lengthOfLongestSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val s = "dvdf"
        val expected = 3

        val result = lengthOfLongestSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_6() {
        val s = "adbvdfegtuio"
        val expected = 10

        val result = lengthOfLongestSubstring.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_7() {
        val s = "   adb e$"
        val expected = 6

        val result = lengthOfLongestSubstring.solve(s)

        assertEquals(expected, result)
    }
}