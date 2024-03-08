package dev.nartov;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        Main.ListNode node1 = new Main.ListNode(1);
        Main.ListNode node2 = new Main.ListNode(2);
        Main.ListNode node3 = new Main.ListNode(4);
        Main.ListNode node4 = new Main.ListNode(1);
        Main.ListNode node5 = new Main.ListNode(3);
        Main.ListNode node6 = new Main.ListNode(4);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        new Main().mergeTwoLists(node1,node4);
    }

}