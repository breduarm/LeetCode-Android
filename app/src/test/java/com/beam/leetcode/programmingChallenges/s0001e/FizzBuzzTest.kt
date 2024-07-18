package com.beam.leetcode.programmingChallenges.s0001e

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    fun case_1() {
        val n = 15
        val expected = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizzbuzz"

        val result = fizzBuzz.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val n = 101
        val expected = ""

        val result = fizzBuzz.solve(n)

        assertEquals(expected, result)
    }
}