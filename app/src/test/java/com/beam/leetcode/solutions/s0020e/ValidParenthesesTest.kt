package com.beam.leetcode.solutions.s0020e

import org.junit.Assert.assertEquals
import org.junit.Test

class ValidParenthesesTest {
    private val validParentheses = ValidParentheses()

    @Test
    fun check_pair_parentheses_are_valid() {
        val s = "()"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_pair_of_parentheses_braces_brackets_are_valid() {
        val s = "(){}[]"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_pair_of_parentheses_brackets_braces_are_valid() {
        val s = "()[]{}"
        val expected = true

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }

    @Test
    fun check_parentheses_open_and_bracket_close_are_not_valid() {
        val s = "(]"
        val expected = false

        val result = validParentheses.solve(s)

        assertEquals(expected, result)
    }
}