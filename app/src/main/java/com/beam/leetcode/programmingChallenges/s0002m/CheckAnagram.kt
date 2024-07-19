package com.beam.leetcode.programmingChallenges.s0002m

class CheckAnagram {

    fun solve(firstWord: String, secondWord: String): Boolean {
        val fwLower = firstWord.lowercase()
        val swLower = secondWord.lowercase()

        if (fwLower == swLower || fwLower.length != swLower.length) return false

        var firstWordAcc = 0
        var secondWordAcc = 0

        for (i in fwLower.indices) {
            firstWordAcc += (fwLower[i] - 'a')
            secondWordAcc += (swLower[i] - 'a')
        }

        return firstWordAcc == secondWordAcc
    }
}