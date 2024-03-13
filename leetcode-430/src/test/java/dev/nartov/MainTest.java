package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        Main.Node node1 = new Main.Node(1);
        Main.Node node2 = new Main.Node(2);
        Main.Node node3 = new Main.Node(3);
        Main.Node node4 = new Main.Node(4);
        Main.Node node5 = new Main.Node(5);
        Main.Node node6 = new Main.Node(6);
        Main.Node node7 = new Main.Node(7);
        Main.Node node8 = new Main.Node(8);
        Main.Node node9 = new Main.Node(9);
        Main.Node node10 = new Main.Node(10);
        Main.Node node11 = new Main.Node(11);
        Main.Node node12 = new Main.Node(12);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        node2.prev = node1;
        node3.prev = node2;
        node4.prev = node3;
        node5.prev = node4;
        node6.prev = node5;

        node3.child = node7;

        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

        node8.prev = node9;
        node9.prev = node8;
        node10.prev = node7;

        node8.child = node11;

        node11.next = node12;

        node12.prev = node11;

        new Main().flatten(node1);
    }

    @Test
    public void test2() {
        Main.Node node1 = new Main.Node(1);
        Main.Node node2 = new Main.Node(2);
        Main.Node node3 = new Main.Node(3);

        node1.next = node2;
        node2.prev = node1;
        node1.child = node3;


        new Main().flatten(node1);

    }

    @Test
    public void test3() {

        //[1,null,2,null,3,null]
        Main.Node node1 = new Main.Node(1);
        Main.Node node2 = new Main.Node(2);
        Main.Node node3 = new Main.Node(3);

        node1.child = node2;
        node2.child = node3;


        new Main().flatten(node1);

    }

}