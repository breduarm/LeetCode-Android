package com.beam.leetcode.solutions.s0020e

import org.junit.Assert.assertEquals
import org.junit.Test

class ValidParenthesesTest {
    private val validParentheses = ValidParentheses()

    @Test
    fun case_1() {
        val s = "()"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val s = "[]"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val s = "{}"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val s = "()[]{}"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val s = "([])"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_6() {
        val s = "([{}])"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_7() {
        val s = "(]"
        val expected = false

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_8() {
        val s = "([)]"
        val expected = false

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_9() {
        val s = ")("
        val expected = false

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun case_10() {
        val s = "())("
        val expected = false

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }
}