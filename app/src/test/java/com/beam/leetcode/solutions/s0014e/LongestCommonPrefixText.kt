package com.beam.leetcode.solutions.s0014e

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestCommonPrefixText {
    private val longestCommonPrefix = LongestCommonPrefix()

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