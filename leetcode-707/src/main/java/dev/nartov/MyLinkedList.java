package dev.nartov;

class MyLinkedList {

    Node head;
    Node tail;
    int length;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index > this.length - 1 || index < 0) return -1;

        Node curr = findNode(index);
        return curr.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head != null) {
            node.next = head;
            head.prev = node;
        }
        head = node;
        length++;

        if (length == 1) tail = head;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (tail != null) {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        length++;

        if (length == 1) head = tail;
    }

    public void addAtIndex(int index, int val) {
        if (index == length) addAtTail(val);
        else if (index == 0) addAtHead(val);
        else if (index >= 0 && index < length) {
            Node node = new Node(val);
            Node curr = findNode(index);

            node.next = curr;
            node.prev = curr.prev;
            curr.prev.next = node;
            curr.prev = node;
            length++;

        }
    }

    private Node findNode(int index) {
        Node curr;

        if (index > length / 2) {
            //go from tail
            int i = length - 1;
            curr = tail;
            while (i-- != index) {
                curr = curr.prev;
            }
        } else {
            //go from head
            int i = 0;
            curr = head;
            while (i++ != index) {
                curr = curr.next;
            }
        }
        return curr;
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < length) {
            Node curr = findNode(index);
            if (curr.prev != null) curr.prev.next = curr.next;
            if (curr.next != null) curr.next.prev = curr.prev;

            if (curr == head) head = curr.next;
            if (curr == tail) tail = curr.prev;
            length--;
        }
    }

    public class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
}





