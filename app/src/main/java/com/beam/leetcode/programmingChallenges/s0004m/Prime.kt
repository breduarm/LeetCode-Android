package com.beam.leetcode.programmingChallenges.s0004m

import kotlin.math.sqrt

class Prime {

    // Solution using the sieve of Eratosthenes algorithm

    fun solve(n: Int): Pair<Boolean, IntArray> {
        if (n < 2 || n >= Int.MAX_VALUE) return false to intArrayOf()

        val primeFlags = BooleanArray(n + 1) { true }
        primeFlags[0] = false
        primeFlags[1] = false

        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (primeFlags[i]) {
                for (j in (i * i)..n step i) {
                    primeFlags[j] = false
                }
            }
        }

        val primes: List<Int> = primeFlags.mapIndexed { index, isPrime ->
            if (isPrime) index else null
        }.filterNotNull()

        return primeFlags[n] to primes.toIntArray()
    }
}