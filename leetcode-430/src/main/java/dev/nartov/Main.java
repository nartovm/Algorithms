package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Node oldNext;

    public Node flatten(Node head) {
        if (head == null) return head;
        Node curr = head;
        oldNext = curr;
        while (curr.next != null || curr.child!=null) {
            oldNext = curr.next;
            if (curr.child != null) {
                flatten(curr.child);
                if (curr.next!=null) {
                    curr.next.prev = oldNext;
                    curr.next.prev.next = curr.next;
                }
                curr.child.prev = curr;
                curr.next = curr.child;
                curr.child = null;
            }
            curr = oldNext;
        }

        return head;
    }


    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }
}