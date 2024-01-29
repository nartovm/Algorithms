package dev.nartov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testOddNumberOfNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode middle = solution.middleNode(head);
        assertEquals(3, middle.val);
    }

    @Test
    void testEvenNumberOfNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode middle = solution.middleNode(head);
        assertEquals(3, middle.val);
    }

    @Test
    void testSingleNode() {
        ListNode head = new ListNode(1);
        ListNode middle = solution.middleNode(head);
        assertEquals(1, middle.val);
    }

    @Test
    void testNullHead() {
        ListNode middle = solution.middleNode(null);
        assertNull(middle);
    }
}