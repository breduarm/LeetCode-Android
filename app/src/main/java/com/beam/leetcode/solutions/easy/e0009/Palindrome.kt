package com.beam.leetcode.solutions.easy.e0009

class Palindrome {

    fun solve(x: Int): Boolean {
        if (x < 0) return false
        var numberToCheck = x
        var result = 0
        while (numberToCheck != 0) {
            result = result * 10 + numberToCheck % 10
            numberToCheck /= 10
        }
        return x == result
    }
}