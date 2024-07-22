package com.beam.leetcode.solutions.s0028e

class FirstOccurrenceInAStr {

    fun solve(haystack: String, needle: String): Int {
        if (haystack.isEmpty() || needle.isEmpty() || needle.length > haystack.length) return -1

        // If both are the same word so return first index
        if (haystack == needle) return 0

        for (i in 0..< haystack.length - (needle.length - 1)) {
            if (haystack[i] == needle.first()) {
                if (haystack.substring(i, (i + needle.length)) == needle) {
                    return i
                }
            }
        }

        // There is no coincidences
        return -1
    }
}