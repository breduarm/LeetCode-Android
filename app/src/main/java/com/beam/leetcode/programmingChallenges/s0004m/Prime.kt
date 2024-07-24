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
        if (n <= 1) return false
        if (n <= 3) return true
        if (n % 2 == 0 || n % 3 == 0) return false

        var i = 5
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false
            i += 6
        }

        return true
    }
}