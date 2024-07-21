package com.beam.leetcode.solutions.s0028e

import org.junit.Assert.assertEquals
import org.junit.Test

class FirstOccurrenceInAStrTest {
    private val firstOccurrenceInAStr = FirstOccurrenceInAStr()

    @Test
    fun case_1() {
        val haystack = "sadbutsad"
        val needle = "sad"
        val expected = 0

        val result = firstOccurrenceInAStr.solve(haystack, needle)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val haystack = "leetcode"
        val needle = "leeto"
        val expected = -1

        val result = firstOccurrenceInAStr.solve(haystack, needle)

        assertEquals(expected, result)
    }
}