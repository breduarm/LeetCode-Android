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

    @Test
    fun case_3() {
        val haystack = "butsad"
        val needle = "sad"
        val expected = 3

        val result = firstOccurrenceInAStr.solve(haystack, needle)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val haystack = "bsutsad"
        val needle = "sad"
        val expected = 4

        val result = firstOccurrenceInAStr.solve(haystack, needle)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val haystack = "mississippi"
        val needle = "a"
        val expected = -1

        val result = firstOccurrenceInAStr.solve(haystack, needle)

        assertEquals(expected, result)
    }

    @Test
    fun case_6() {
        val haystack = "asdf"
        val needle = "f"
        val expected = 3

        val result = firstOccurrenceInAStr.solve(haystack, needle)

        assertEquals(expected, result)
    }
}