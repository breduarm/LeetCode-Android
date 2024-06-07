package com.beam.leetcode.solutions.s0014e

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestCommonPrefixTest {
    private val longestCommonPrefix = LongestCommonPrefix()

    @Test
    fun check_strs_with_only_one_empty_value() {
        val strs = arrayOf("")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun check_strs_with_first_empty_value() {
        val strs = arrayOf("", "flower", "flow")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun check_strs_with_first_valid_value_and_the_rest_empty() {
        val strs = arrayOf("flower", "", "")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun check_strs_with_empty_values() {
        val strs = arrayOf("", "", "", "")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun check_common_prefix_fl() {
        val strs = arrayOf("flower","flow","flight")
        val expected = "fl"

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }

    @Test
    fun check_non_common_prefix() {
        val strs = arrayOf("dog","racecar","car")
        val expected = ""

        val result = longestCommonPrefix.solve(strs)

        assertEquals(expected, result)
    }
}