package com.beam.leetcode.solutions.s0001e

import kotlin.time.Duration
import kotlin.time.measureTimedValue

class TwoSum {

    fun solve(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf(-1, -1)
    }

    fun solveWithMeasure(nums: IntArray, target: Int): Pair<IntArray, Duration> {
        val (result, executionTime) = measureTimedValue {
            solve(nums, target)
        }
        return result to executionTime
    }
}