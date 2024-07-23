package com.beam.leetcode.solutions.s0021e

import com.beam.leetcode.common.ListNode

class MergeTwoSortedList {

    fun solve(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) return null

        var l1 = list1
        var l2 = list2
        val head = ListNode(-1)
        var result: ListNode? = head

        while (l1 != null || l2 != null) {
            val l1Value = l1?.`val` ?: Int.MAX_VALUE
            val l2Value = l2?.`val` ?: Int.MAX_VALUE
            if (l1Value < l2Value) {
                result?.next = l1
                l1 = l1?.next
                result = result?.next
            } else {
                result?.next = l2
                l2 = l2?.next
                result = result?.next
            }
        }

        return head.next
    }
}