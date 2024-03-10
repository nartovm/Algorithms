package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        Main.ListNode node1 = new Main.ListNode(2);
        Main.ListNode node2 = new Main.ListNode(4);
        Main.ListNode node3 = new Main.ListNode(3);

        Main.ListNode node1a = new Main.ListNode(5);
        Main.ListNode node2a = new Main.ListNode(6);
        Main.ListNode node3a = new Main.ListNode(4);

        node1.next = node2;
        node2.next = node3;

        node1a.next = node2a;
        node2a.next = node3a;

        new Main().addTwoNumbers(node1,node1a);

    }

    @Test
    public void test2() {
        Main.ListNode node1 = new Main.ListNode(9);


        Main.ListNode node1a = new Main.ListNode(1);
        Main.ListNode node2a = new Main.ListNode(9);
        Main.ListNode node3a = new Main.ListNode(9);
        Main.ListNode node4a = new Main.ListNode(9);
        Main.ListNode node5a = new Main.ListNode(9);
        Main.ListNode node6a = new Main.ListNode(9);
        Main.ListNode node7a = new Main.ListNode(9);
        Main.ListNode node8a = new Main.ListNode(9);
        Main.ListNode node9a = new Main.ListNode(9);
        Main.ListNode node10a = new Main.ListNode(9);



        node1a.next = node2a;
        node2a.next = node3a;
        node3a.next = node4a;
        node4a.next = node5a;
        node5a.next = node6a;
        node6a.next = node7a;
        node7a.next = node8a;
        node8a.next = node9a;
        node9a.next = node10a;

        new Main().addTwoNumbers(node1,node1a);

    }
}