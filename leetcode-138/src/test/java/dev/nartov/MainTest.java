package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        Main.Node node1 = new Main.Node(7);
        Main.Node node2 = new Main.Node(13);
        Main.Node node3 = new Main.Node(11);
        Main.Node node4 = new Main.Node(10);
        Main.Node node5 = new Main.Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        new Main().copyRandomList(node1);
    }

}