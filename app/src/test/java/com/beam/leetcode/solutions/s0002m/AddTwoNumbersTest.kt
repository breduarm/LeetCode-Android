package com.beam.leetcode.solutions.s0002m

import com.beam.leetcode.solutions.s0002m.AddTwoNumbers.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class AddTwoNumbersTest {
    private val addTwoNumbers = AddTwoNumbers()

    @Test
    fun case_1() {
        var l1: ListNode? = ListNode(2)
        val l1Head = l1
        l1?.next = ListNode(4)
        l1 = l1?.next
        l1?.next = ListNode(3)
        l1 = l1?.next

        var l2: ListNode? = ListNode(5)
        val l2Head = l2
        l2?.next = ListNode(6)
        l2 = l2?.next
        l2?.next = ListNode(4)
        l2 = l2?.next

        var expected: ListNode? = ListNode(7)
        var expectedHead = expected
        expected?.next = ListNode(0)
        expected = expected?.next
        expected?.next = ListNode(8)

        var result = addTwoNumbers.solve(l1Head, l2Head)

        while (expectedHead?.next != null || result?.next != null) {
            assertEquals(expectedHead?.`val`, result?.`val`)
            expectedHead = expectedHead?.next
            result = result?.next
        }
    }
}