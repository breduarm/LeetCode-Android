package com.beam.leetcode.solutions.s0006m

import org.junit.Assert.assertEquals
import org.junit.Test

class ZigzagConversionTest {
    private val zigzagConversion = ZigzagConversion()

    @Test
    fun case_1() {
        val s = "PAYPALISHIRING"
        val numRow = 3
        val expected = "PAHNAPLSIIGYIR"

        val result = zigzagConversion.solve(s, numRow)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val s = "PAYPALISHIRING"
        val numRow = 4
        val expected = "PINALSIGYAHRPI"

        val result = zigzagConversion.solve(s, numRow)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val s = "A"
        val numRow = 1
        val expected = "A"

        val result = zigzagConversion.solve(s, numRow)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val s = "PAYPALISHIRING"
        val numRow = 1
        val expected = "PAYPALISHIRING"

        val result = zigzagConversion.solve(s, numRow)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val s = "PAYPALISHIRING"
        val numRow = 5
        val expected = "PHASIYIRPLIGAN"

        val result = zigzagConversion.solve(s, numRow)

        assertEquals(expected, result)
    }

    @Test
    fun case_6() {
        val s = "PAYPALISHIRING"
        val numRow = 6
        val expected = "PRAIIYHNPSGAIL"

        val result = zigzagConversion.solve(s, numRow)

        assertEquals(expected, result)
    }
}