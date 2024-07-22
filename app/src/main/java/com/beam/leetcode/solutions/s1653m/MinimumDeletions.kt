package com.beam.leetcode.solutions.s1653m

import kotlin.math.min

class MinimumDeletions {

    fun solve(s: String): Int {
        var bCount = 0
        var minDeletions = 0

        for (char in s) {
            if (char == 'a') {
                minDeletions = min(minDeletions + 1, bCount)
            } else {
                bCount++
            }
        }

        return minDeletions
    }
}