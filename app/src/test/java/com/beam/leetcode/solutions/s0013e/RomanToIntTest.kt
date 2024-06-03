package com.beam.leetcode.solutions.s0013e

import org.junit.Assert.assertEquals
import org.junit.Test

class RomanToIntTest {
    private val romanToInt = RomanToInt()

    @Test
    fun check_roman_number_III_is_3() {
        val s = "III"
        val expected = 3

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_roman_number_LVIII_is_58() {
        val s = "LVIII"
        val expected = 58

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_roman_number_MCMXCIV_is_1994() {
        val s = "MCMXCIV"
        val expected = 1994

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }
}