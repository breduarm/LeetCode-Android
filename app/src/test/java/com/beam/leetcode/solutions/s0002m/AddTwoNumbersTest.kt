package com.beam.leetcode.solutions.s0002m

import com.beam.leetcode.common.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class AddTwoNumbersTest {
    private val addTwoNumbers = AddTwoNumbers()

    @Test
    fun case_1() {
        var l1Node: ListNode? = ListNode(2)
        val l1Head = l1Node
        l1Node?.next = ListNode(4)
        l1Node = l1Node?.next
        l1Node?.next = ListNode(3)

        var l2Node: ListNode? = ListNode(5)
        val l2Head = l2Node
        l2Node?.next = ListNode(6)
        l2Node = l2Node?.next
        l2Node?.next = ListNode(4)

        var expectedNode: ListNode? = ListNode(7)
        var expected = expectedNode
        expectedNode?.next = ListNode(0)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(8)

        var result = addTwoNumbers.solve(l1Head, l2Head)

        while (expected?.next != null || result?.next != null) {
            assertEquals(expected?.`val`, result?.`val`)
            expected = expected?.next
            result = result?.next
        }

        assertEquals(expected?.`val`, result?.`val`)
    }

    @Test
    fun case_2() {
        val l1 = ListNode(0)
        val l2 = ListNode(0)

        val expected = ListNode(0)

        val result = addTwoNumbers.solve(l1, l2)

        assertEquals(expected.`val`, result?.`val`)
        assertEquals(expected.next, result?.next)
    }

    @Test
    fun case_3() {
        var l1Node: ListNode? = ListNode(9)
        val l1Head = l1Node
        l1Node?.next = ListNode(9)
        l1Node = l1Node?.next
        l1Node?.next = ListNode(9)
        l1Node = l1Node?.next
        l1Node?.next = ListNode(9)
        l1Node = l1Node?.next
        l1Node?.next = ListNode(9)
        l1Node = l1Node?.next
        l1Node?.next = ListNode(9)
        l1Node = l1Node?.next
        l1Node?.next = ListNode(9)

        var l2Node: ListNode? = ListNode(9)
        val l2Head = l2Node
        l2Node?.next = ListNode(9)
        l2Node = l2Node?.next
        l2Node?.next = ListNode(9)
        l2Node = l2Node?.next
        l2Node?.next = ListNode(9)

        var expectedNode: ListNode? = ListNode(8)
        var expected = expectedNode
        expectedNode?.next = ListNode(9)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(9)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(9)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(0)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(0)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(0)
        expectedNode = expectedNode?.next
        expectedNode?.next = ListNode(1)

        var result = addTwoNumbers.solve(l1Head, l2Head)

        while (expected?.next != null || result?.next != null) {
            assertEquals(expected?.`val`, result?.`val`)
            expected = expected?.next
            result = result?.next
        }

        assertEquals(expected?.`val`, result?.`val`)
    }
}