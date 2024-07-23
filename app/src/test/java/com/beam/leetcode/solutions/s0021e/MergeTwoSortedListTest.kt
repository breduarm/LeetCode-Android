package com.beam.leetcode.solutions.s0021e

import com.beam.leetcode.common.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class MergeTwoSortedListTest {
    private val mergeTwoSortedList = MergeTwoSortedList()

    @Test
    fun case_1() {
        var l1Node: ListNode? = ListNode(1)
        val l1Head = l1Node
        l1Node?.next = ListNode(2)
        l1Node = l1Node?.next
        l1Node?.next = ListNode(4)

        var l2Node: ListNode? = ListNode(1)
        val l2Head = l2Node
        l2Node?.next = ListNode(3)
        l2Node = l2Node?.next
        l2Node?.next = ListNode(4)

        var expectedNode: ListNode? = ListNode(1)
        var expected = expectedNode
        expectedNode?.next = ListNode(1)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(2)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(3)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(4)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(4)

        var result = mergeTwoSortedList.solve(l1Head, l2Head)

        while (expected?.next != null || result?.next != null) {
            assertEquals(expected?.`val`, result?.`val`)
            expected = expected?.next
            result = result?.next
        }

        assertEquals(expected?.`val`, result?.`val`)
    }

    @Test
    fun case_2() {
        val l1Head: ListNode? = null
        val l2Head: ListNode? = null
        val expected: ListNode? = null

        val result = mergeTwoSortedList.solve(l1Head, l2Head)

        assertEquals(expected?.`val`, result?.`val`)
    }

    @Test
    fun case_3() {
        val l1Head: ListNode? = null
        val l2Head = ListNode(0)
        val expected = ListNode(0)

        val result = mergeTwoSortedList.solve(l1Head, l2Head)

        assertEquals(expected.`val`, result?.`val`)
    }
}