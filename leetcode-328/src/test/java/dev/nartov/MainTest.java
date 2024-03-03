package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        Main.ListNode node1 = new Main.ListNode(1);
        Main.ListNode node2 = new Main.ListNode(2);
        Main.ListNode node3 = new Main.ListNode(3);
        Main.ListNode node4 = new Main.ListNode(4);
        Main.ListNode node5 = new Main.ListNode(5);
        Main.ListNode node6 = new Main.ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        new Main().oddEvenList(node1);
    }

    @Test
    public void test2() {
        Main.ListNode node1 = new Main.ListNode(1);
        Main.ListNode node2 = new Main.ListNode(2);
        Main.ListNode node3 = new Main.ListNode(3);
        Main.ListNode node4 = new Main.ListNode(4);
        Main.ListNode node5 = new Main.ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        new Main().oddEvenList(node1);
    }
}