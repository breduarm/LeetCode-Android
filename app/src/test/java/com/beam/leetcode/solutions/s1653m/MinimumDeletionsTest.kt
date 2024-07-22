package com.beam.leetcode.solutions.s1653m

import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumDeletionsTest {
    private val minimumDeletions = MinimumDeletions()

    @Test
    fun case_1() {
        val s = "aababbab"
        val expected = 2

        val result = minimumDeletions.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val s = "bbaaaaabb"
        val expected = 2

        val result = minimumDeletions.solve(s)

        assertEquals(expected, result)
    }
}