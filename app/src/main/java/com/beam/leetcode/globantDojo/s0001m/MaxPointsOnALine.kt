package com.beam.leetcode.globantDojo.s0001m

import kotlin.math.max

class MaxPointsOnALine {

    fun solve(points: Array<IntArray>): Int {
        if (points.size <= 2) return points.size

        var maxPoints = 0

        // Iterate through each point
        for (i in points.indices) {
            val slopes = mutableMapOf<Pair<Int, Int>, Int>()
            var currentMax = 0

            // Iterate through the remaining points in order to find the all possible slopes
            for (j in i + 1 until points.size) {
                val xDiff = points[j][0] - points[i][0]
                val yDiff = points[j][1] - points[i][1]

                val gcd = gcd(xDiff, yDiff)
                val slope = Pair(xDiff / gcd, yDiff / gcd)

                slopes[slope] = slopes.getOrDefault(slope, 0) + 1
                currentMax = max(currentMax, slopes[slope] ?: 0)
            }

            maxPoints = max(maxPoints, currentMax)
        }

        return maxPoints + 1 // Add 1 for the current point
    }

    // Calculate the greatest common divisor (GCD)
    private fun gcd(a: Int, b: Int): Int =
        if (b == 0) a else gcd( a= b, b = a % b)
}