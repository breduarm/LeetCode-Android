package com.beam.leetcode.programmingChallenges.s0004m

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class PrimeTest {
    private val prime = Prime()

    @Test
    fun case_1() {
        val n = 5
        val expectedBoolean = true
        val expectedPrimes = intArrayOf(1, 2, 3, 5)

        val (resultBoolean, resultPrimes) = prime.solve(n)

        assertEquals(expectedBoolean, resultBoolean)
        assertEquals(expectedPrimes, resultPrimes)
    }

    @Test
    fun case_2() {
        val n = Int.MAX_VALUE
        val expectedBoolean = false
        val expectedPrimes = intArrayOf()

        val (resultBoolean, resultPrimes) = prime.solve(n)

        assertEquals(expectedBoolean, resultBoolean)
        assertArrayEquals(expectedPrimes, resultPrimes)
    }

    @Test
    fun case_3() {
        val n = -2
        val expectedBoolean = false
        val expectedPrimes = intArrayOf()

        val (resultBoolean, resultPrimes) = prime.solve(n)

        assertEquals(expectedBoolean, resultBoolean)
        assertEquals(expectedPrimes, resultPrimes)
    }

    @Test
    fun case_4() {
        val n = 8
        val expectedBoolean = false
        val expectedPrimes = intArrayOf(1, 2, 3, 5, 7)

        val (resultBoolean, resultPrimes) = prime.solve(n)

        assertEquals(expectedBoolean, resultBoolean)
        assertEquals(expectedPrimes, resultPrimes)
    }
}