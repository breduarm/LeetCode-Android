package com.beam.leetcode.solutions.s0013e

import org.junit.Assert.assertEquals
import org.junit.Test

class RomanToIntTest {
    private val romanToInt = RomanToInt()

    @Test
    fun case_1() {
        val s = "III"
        val expected = 3

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val s = "II"
        val expected = 2

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val s = "XII"
        val expected = 12

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val s = "XXVII"
        val expected = 27

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val s = "IV"
        val expected = 4

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_6() {
        val s = "IX"
        val expected = 9

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_7() {
        val s = "MMXXIV"
        val expected = 2024

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_8() {
        val s = "MCMXCIV"
        val expected = 1994

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_9() {
        val s = "D"
        val expected = 500

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }
}