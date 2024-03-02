package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        Main.ListNode node1 = new Main.ListNode(1);
        Main.ListNode node2 = new Main.ListNode(2);
        node1.next = node2;
        node2.next = node1;
        new Main().detectCycle(node1);
    }
}