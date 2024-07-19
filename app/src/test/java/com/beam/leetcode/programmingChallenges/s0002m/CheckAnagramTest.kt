package com.beam.leetcode.programmingChallenges.s0002m

import org.junit.Assert.assertEquals
import org.junit.Test

class CheckAnagramTest {
    private val checkAnagram = CheckAnagram()

    @Test
    fun case_1() {
        val firstWord = "table"
        val secondWord = "labet"
        val expected = true

        val result = checkAnagram.solve(firstWord, secondWord)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val firstWord = "table"
        val secondWord = "table"
        val expected = false

        val result = checkAnagram.solve(firstWord, secondWord)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val firstWord = "table"
        val secondWord = "label"
        val expected = false

        val result = checkAnagram.solve(firstWord, secondWord)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val firstWord = "table"
        val secondWord = "tables"
        val expected = false

        val result = checkAnagram.solve(firstWord, secondWord)

        assertEquals(expected, result)
    }
}