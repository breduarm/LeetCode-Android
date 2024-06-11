package com.beam.leetcode.solutions.s0004h

import kotlin.math.max
import kotlin.math.min

class FindMedianSortedArrays {

    /**
     * This solution merges both arrays into one, which has O(n) complexity. Then, the new array
     * calls `sort()` method with a O(n log n) complexity in the worst cases, since Kotlin uses
     * the `MergeSort` or `TimSort` algorithm.
     *
     * Finally, the result is calculated with a O(1) complexity because only simple arithmetic
     * operations are made, which has a constant complexity.
     *
     * Conclusion: O(n) + O(n log n) + O(1) = O(n log n)
     */
    fun solveEasy(nums1: IntArray, nums2: IntArray): Double {
        val numsMerged = nums1 + nums2
        numsMerged.sort()

        val result = if (numsMerged.size % 2 == 0) {
            // even
            val index: Int = numsMerged.size / 2
            (numsMerged[index - 1] + numsMerged[index]) / 2.0
        } else {
            // odd
            val index: Int = numsMerged.size / 2
            numsMerged[index].toDouble()
        }

        return result
    }

    /**
     * This solution uses Binary search, which is a popular algorithm for searching an element in a
     * sorted array or list. It works by repeatedly dividing the search interval in half,
     * until the value is found or the search interval is empty.
     *
     * Here's how the binary search algorithm works in more detail:
     *
     * 1. The algorithm starts by selecting the middle element of the sorted array or list.
     * 2. If the middle element is equal to the search value, the algorithm returns the index
     * of the element.
     * 3. If the middle element is less than the search value, the algorithm discards
     * the left half of the array or list and repeats the search on the right half.
     * 4. If the middle element is greater than the search value, the algorithm discards
     * the right half of the array or list and repeats the search on the left half.
     * 5. The algorithm continues to divide the search interval in half and repeat the search until
     * the value is found or the search interval is empty.
     *
     * Binary search has a time complexity of O(log n),where n is the number of elements in the
     * array or list. This makes it much more efficient than linear search,
     * which has a time complexity of O(n), for large arrays or lists.
     *
     * However, binary search requires the array or list to be sorted in advance,which can be
     * a significant overhead for large data sets. In addition, binary search is not suitable
     * for unordered or dynamic data structures, such as hash tables or linked lists.
     *
     */
    fun solve(nums1: IntArray, nums2: IntArray): Double {
        if (nums1.size > nums2.size) {
            return solve(nums2, nums1)
        }

        var start = 0
        var end = nums1.size

        var part1Index: Int
        var part2Index: Int

        var partLeft1: Int
        var partRight1: Int
        var partLeft2: Int
        var partRight2: Int

        while (start <= end) {
            part1Index = (end + start) / 2
            part2Index = ((nums1.size + nums2.size + 1) / 2) - part1Index

            partLeft1 = nums1.getOrNull(part1Index - 1) ?: Int.MIN_VALUE
            partRight1 = nums1.getOrNull(part1Index) ?: Int.MAX_VALUE
            partLeft2 = nums2.getOrNull(part2Index - 1) ?: Int.MIN_VALUE
            partRight2 = nums2.getOrNull(part2Index) ?: Int.MAX_VALUE

            when {
                partLeft1 > partRight2 -> end = part1Index - 1
                partLeft2 > partRight1 -> start = part1Index + 1
                else -> return if ((nums1.size + nums2.size) % 2 == 0) {
                    // even
                    (max(partLeft1, partLeft2) + min(partRight1, partRight2)) / 2.0
                } else {
                    // odd
                    max(partLeft1, partLeft2).toDouble()
                }
            }
        }

        return -1.0
    }
}