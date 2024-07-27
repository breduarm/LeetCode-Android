package com.beam.leetcode.utils

/**
 * GCD (Greatest Common Divisor)
 *
 * Calculates the GCD of two integers using the Euclides Algorithm
 *
 * The Euclidean algorithm is an efficient method for computing the GCD of two numbers.
 * It is based on the property that the GCD of two numbers also divides the difference
 * of those numbers.
 *
 * 1. if b == 0 then GCD = a.
 * 2. Otherwise, replace a with b, and b with a mod b and repeat.
 *
 * @param a the first integer.
 * @param b the second integer.
 * @return The Greatest Common Divisor of [a] and [b].
 *
 * @author Bryan Armijos
 * @since 1.0
 */
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}