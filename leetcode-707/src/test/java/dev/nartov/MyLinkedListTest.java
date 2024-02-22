package dev.nartov;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();

    @BeforeAll
    public static void init() {

    }

    @Test
    void addAtHead() {
        list.addAtHead(5);
        list.addAtHead(4);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtHead(0);
    }

    @Test
    void addAtIndexTest1() {

    }

    @Test
    void get() {
    }


    @Test
    void addAtTail() {
    }

    @Test
    void deleteAtIndex() {
    }

    @Test
    public void test0() {
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        System.out.println(list.get(1));
        list.deleteAtIndex(1);
        System.out.println(list.get(1));
    }

    @Test
    public void test1() {
        list.addAtHead(1);
        list.deleteAtIndex(0);
    }

    @Test
    public void test6() {
        list.addAtIndex(0, 10);
        list.addAtIndex(0, 20);
        list.addAtIndex(1, 30);
        list.get(0);
    }

    @Test
    public void test7() {
        list.addAtTail(1);
        list.get(0);
    }

    @Test
    public void test10() {
        list.addAtHead(4);
        list.get(1);
        list.addAtHead(1);
        list.addAtHead(5);
        list.deleteAtIndex(3);
        list.addAtHead(7);
        list.get(3);
        list.get(3);
        list.get(3);
        list.addAtHead(1);
        list.deleteAtIndex(4);
    }

    @Test
    public void test19() {
        list.addAtHead(84);
        list.addAtTail(2);
        list.addAtTail(39);
        System.out.println(list.get(3));
        System.out.println(list.get(1));
        list.addAtTail(42);
        list.addAtIndex(1, 80);
        list.addAtHead(14);
        list.addAtHead(1);
        list.addAtTail(53);
        list.addAtTail(98);
        list.addAtTail(19);
        list.addAtTail(12);
        System.out.println(list.get(2));
        list.addAtHead(16);
        list.addAtHead(33);
        list.addAtIndex(4, 17);
        list.addAtIndex(6, 8);
        list.addAtHead(37);
        list.addAtTail(43);
        list.deleteAtIndex(11);
        list.addAtHead(80);
        list.addAtHead(31);
        list.addAtIndex(13, 23);
        list.addAtTail(17);
        System.out.println(list.get(4));
        list.addAtIndex(10, 0);
        list.addAtTail(21);
        list.addAtHead(73);
        list.addAtHead(22);
        list.addAtIndex(24, 37);
        list.addAtTail(14);
        list.addAtHead(97);
        list.addAtHead(8);
        System.out.println(list.get(6));
        list.deleteAtIndex(17);
        list.addAtTail(50);
        list.addAtTail(28);
        list.addAtHead(76);
        list.addAtTail(79);
        System.out.println(list.get(18));
        list.deleteAtIndex(30);
        list.addAtTail(5);
        list.addAtHead(9);
        list.addAtTail(83);
        list.deleteAtIndex(3);
        list.addAtTail(40);
        list.deleteAtIndex(26);
        list.addAtIndex(20, 90);
        list.deleteAtIndex(30);
        list.addAtTail(40);
        list.addAtHead(56);
        list.addAtIndex(15, 23);
        list.addAtHead(51);
        list.addAtHead(21);
        System.out.println(list.get(26));
        list.addAtHead(83);
        System.out.println(list.get(30));
        list.addAtHead(12);
        list.deleteAtIndex(8);
        System.out.println(list.get(4));
        list.addAtHead(20);
        list.addAtTail(45);
        System.out.println(list.get(10));
        list.addAtHead(56);
        System.out.println(list.get(18));
        list.addAtTail(33);
        System.out.println(list.get(2));
        list.addAtTail(70);
        list.addAtHead(57);
        list.addAtIndex(31, 24);
        list.addAtIndex(16, 92);
        list.addAtHead(40);
        list.addAtHead(23);
        list.deleteAtIndex(26);
        System.out.println(list.get(1));
        list.addAtHead(92);
        list.addAtIndex(3, 78);
        list.addAtTail(42);
        System.out.println(list.get(18));
        list.addAtIndex(39, 9);
        System.out.println(list.get(13));
        list.addAtIndex(33, 17);
        System.out.println(list.get(51));
        list.addAtIndex(18, 95);
        list.addAtIndex(18, 33);
        list.addAtHead(80);
        list.addAtHead(21);
        list.addAtTail(7);
        list.addAtIndex(17, 46);
        System.out.println(list.get(33));
        list.addAtHead(60);
        list.addAtTail(26);
        list.addAtTail(4);
        list.addAtHead(9);
        System.out.println(list.get(45));
        list.addAtTail(38);
        list.addAtHead(95);
        list.addAtTail(78);
        System.out.println(list.get(54));
        list.addAtIndex(42, 86);
    }

    @Test
    public void test58() {
        list.addAtHead(2);
        list.addAtIndex(0, 1);
        System.out.println(list.get(1));
    }

    @Test
    public void test59() {
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        System.out.println(list.get(1));
        list.deleteAtIndex(1);
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        list.deleteAtIndex(3);
        list.deleteAtIndex(0);
        System.out.println(list.get(0));
        list.deleteAtIndex(0);
        System.out.println(list.get(0));
    }
}