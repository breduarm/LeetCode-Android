package com.beam.leetcode.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsTest {

    @Test
    fun `GCD of 48 and 18 is 6`() {
        assertEquals(6, gcd(48, 18))
    }

    @Test
    fun `GCD of 35 and 14 is 7`() {
        assertEquals(7, gcd(35, 14))
    }

    @Test
    fun `GCD of 0 and 5 is 5`() {
        assertEquals(5, gcd(0, 5))
    }

    @Test
    fun `GCD of 7 and 0 is 7`() {
        assertEquals(7, gcd(7, 0))
    }

    @Test
    fun `GCD of 0 and 0 is 0`() {
        assertEquals(0, gcd(0, 0))
    }

    @Test
    fun `GCD of -48 and 18 is 6`() {
        assertEquals(6, gcd(-48, 18))
    }

    @Test
    fun `GCD of -48 and -18 is 6`() {
        assertEquals(6, gcd(-48, 18))
    }
}