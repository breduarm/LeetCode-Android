package com.beam.leetcode.solutions.s0006m

class ZigzagConversion {

    fun solve(s: String, numRows: Int): String {
        if (s.length < 2 || numRows < 2) return s

        val resultArray = Array(numRows) { "" }
        var currRow = 0
        var rowIncrement = -1

        s.forEach { c ->
            resultArray[currRow] = resultArray[currRow] + c
            if (currRow == numRows - 1 || currRow == 0) rowIncrement *= -1
            currRow += rowIncrement
        }

        return resultArray.joinToString("")
    }
}