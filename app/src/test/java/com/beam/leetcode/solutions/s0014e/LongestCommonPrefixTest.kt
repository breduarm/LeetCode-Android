package com.beam.leetcode.solutions.s0014e

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestCommonPrefixTest {
    private val longestCommonPrefix = LongestCommonPrefix()

    @Test
    fun case_1() {
        val strs = arrayOf("")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val strs = arrayOf("", "flower", "flow")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val strs = arrayOf("flower", "", "")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val strs = arrayOf("", "", "", "")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val strs = arrayOf("flower","flow","flight")
        val expected = "fl"

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun case_6() {
        val strs = arrayOf("dog","racecar","car")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }
}