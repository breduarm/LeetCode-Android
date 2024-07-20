package com.beam.leetcode.programmingChallenges.s0003h

import org.junit.Assert.assertEquals
import org.junit.Test

class FibonacciTest {
    private val fibonacci = Fibonacci()

    @Test
    fun case_1() {
        val n = 10
        val expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34"

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_2() {
        val n = -10
        val expected = ""

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_3() {
        val n = 0
        val expected = ""

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_4() {
        val n = 1
        val expected = "0"

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_5() {
        val n = 2
        val expected = "0, 1"

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_6() {
        val n = 3
        val expected = "0, 1, 1"

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_7() {
        val n = 50
        val expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, 2971215073, 4807526976, 7778742049"

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }

    @Test
    fun case_8() {
        val n = Int.MAX_VALUE
        val expected = ""

        val result = fibonacci.solve(n)

        assertEquals(expected, result)
    }
}