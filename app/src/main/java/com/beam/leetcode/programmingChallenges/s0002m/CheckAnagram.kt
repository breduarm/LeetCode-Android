package com.beam.leetcode.programmingChallenges.s0002m

class CheckAnagram {

    fun solve(firstWord: String, secondWord: String): Boolean {
        if (firstWord == secondWord || firstWord.length != secondWord.length) return false

        var result = secondWord

        firstWord.forEach { c ->
            result = result.replaceFirst(c.toString(), "")
        }

        return result.isEmpty()
    }
}