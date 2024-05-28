package com.beam.leetcode.solutions.s0007m

import kotlin.math.abs

class ReverseInt {

    fun solve(x: Int): Int {
        var temp = abs(x)
        var result: Long = 0

        while (temp > 0) {
            result = result * 10 + (temp % 10)
            if (result > Int.MAX_VALUE) return 0
            temp /= 10
        }

        return (result * if (x > 0) 1 else -1).toInt()
    }
}