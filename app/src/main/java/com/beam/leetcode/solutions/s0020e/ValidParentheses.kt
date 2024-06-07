package com.beam.leetcode.solutions.s0020e

import java.util.Stack

class ValidParentheses {

    fun solve(s: String): Boolean {
        val stack = Stack<Char>()

        s.forEach { c ->
            when (c) {
                '(' -> stack.push(')')
                '[' -> stack.push(']')
                '{' -> stack.push('}')
                // Closed sign
                else -> if (stack.isEmpty() || stack.pop() != c) return false
            }
        }

        return stack.isEmpty()
    }
}