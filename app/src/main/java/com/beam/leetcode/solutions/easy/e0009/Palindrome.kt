package com.beam.leetcode.solutions.easy.e0009

class Palindrome {

    fun solve(x: Int): Boolean {
        if (x < 0) return false
        var number = x
        var result = 0
        while (number != 0) {
            result = result * 10 + number % 10
            number /= 10
        }
        return x == result
    }
}