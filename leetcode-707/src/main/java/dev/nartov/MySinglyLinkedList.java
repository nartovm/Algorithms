package dev.nartov;

class MySinglyLinkedList {
    int length;
    Node head;
    Node tail;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MySinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index < 0 || index > this.length - 1) return -1;
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (this.head != null) {
            newNode.next = this.head;
        }
        if (this.tail == null) this.tail = newNode;
        this.head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
//        if (this.head != null) {
//            Node current = this.head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        } else {
//            this.head = newNode;
//        }
        if (this.tail != null) {
            this.tail.next = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        }
        this.tail = newNode;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.length) return;
        if (index == length) {
            this.addAtTail(val);
            return;
        }
        if (index == 0) {
            this.addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        Node curr = this.head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        length++;
    }

    public void deleteAtIndex(int index) {
        if (index < this.length) {
            Node curr = head;
            if (index == 0) {
                if (head.next != null) {
                    this.head = head.next;
                } else {
                    this.head = null;
                    if (this.length == 1) {
                        this.tail = null;
                    }
                }
            } else {
                for (int i = 0; i < index - 1; i++) {
                    curr = curr.next;
                }
                if (this.tail == curr.next) {
                    this.tail = curr;
                }
                if (curr.next.next != null) {
                    curr.next = curr.next.next;
                } else {
                    curr.next = null;
                }
            }
            length--;
        }
    }
}
