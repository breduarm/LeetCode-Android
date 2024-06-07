package com.beam.leetcode.solutions.s0014e

import java.lang.Integer.min

class LongestCommonPrefix {

    fun solve(strs: Array<String>): String {
        strs.sort()
        var result = ""
        val firstWord = strs.first()
        val lastWord = strs.last()

        for (i in 0 until min(firstWord.length, lastWord.length)) {
            if (firstWord[i] != lastWord[i]) return result
            result += firstWord[i]
        }

        return result
    }
}