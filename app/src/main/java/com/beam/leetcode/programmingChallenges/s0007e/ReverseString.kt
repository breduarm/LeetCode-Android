package com.beam.leetcode.programmingChallenges.s0007e

class ReverseString {

    fun solve(s: String): String {
        val charArray: CharArray = s.toCharArray()
        var left = 0
        var right = charArray.size - 1

        while (left < right) {
            val temp = charArray[left]
            charArray[left] = charArray[right]
            charArray[right] = temp
            left++
            right--
        }

        return String(charArray)
    }
}