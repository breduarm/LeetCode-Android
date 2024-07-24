package com.beam.leetcode.programmingChallenges.s0004m

class Prime {

    fun solve(n: Int): Pair<Boolean, IntArray> {

        if (n < 2 || n >= Int.MAX_VALUE) return false to intArrayOf()
        val primes = mutableListOf(1)

        for (i in 2..n) {
            if (isPrime(i)) {
                primes.add(i)
            }
        }

        val isNPrime = primes.last() == n

        return isNPrime to primes.toIntArray()
    }

    private fun isPrime(n: Int): Boolean {
        for (i in 2..< n) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }
}