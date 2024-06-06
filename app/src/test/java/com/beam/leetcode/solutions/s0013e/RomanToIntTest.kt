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
    fun check_roman_number_II_is_2() {
        val s = "II"
        val expected = 2

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_roman_number_XII_is_12() {
        val s = "XII"
        val expected = 12

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_roman_number_XXVII_is_27() {
        val s = "XXVII"
        val expected = 27

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_roman_number_IV_is_4() {
        val s = "IV"
        val expected = 4

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_roman_number_IX_is_9() {
        val s = "IX"
        val expected = 9

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_roman_number_MMXXIV_is_2024() {
        val s = "MMXXIV"
        val expected = 2024

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

    @Test
    fun check_roman_number_D_is_500() {
        val s = "D"
        val expected = 500

        val result = romanToInt.solve(s)

        assertEquals(expected, result)
    }
}