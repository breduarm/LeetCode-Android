package com.beam.leetcode.solutions.s0004h

import org.junit.Assert.assertEquals
import org.junit.Test

class FindMedianSortedArraysTest {
    private val findMedianSortedArrays = FindMedianSortedArrays()

    @Test
    fun case_1() {
        val nums1 = intArrayOf(1,3)
        val nums2 = intArrayOf(2)
        val expected = 2.0

        val result = findMedianSortedArrays.solve(nums1, nums2)

        assertEquals(expected, result, 0.1)
    }

    @Test
    fun case_2() {
        val nums1 = intArrayOf(1,2)
        val nums2 = intArrayOf(3,4)
        val expected = 2.5

        val result = findMedianSortedArrays.solve(nums1, nums2)

        assertEquals(expected, result, 0.1)
    }
}