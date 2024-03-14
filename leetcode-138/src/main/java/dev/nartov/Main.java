package dev.nartov;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Node copyRandomList(Node head) {
        if (head == null) return head;

        HashMap<Node, Node> map = new HashMap<>();

        Node copyHead = new Node(0);

        Node curr = head;
        Node copyCurr = copyHead;

        while (curr != null) {
            copyCurr.next = new Node(curr.val);
            copyCurr = copyCurr.next;
            map.put(curr, copyCurr);
            curr = curr.next;
        }

        copyHead = copyHead.next;

        curr = head;
        copyCurr = copyHead;

        while (curr != null) {
            copyCurr.random = map.get(curr.random);
            copyCurr = copyCurr.next;
            curr = curr.next;
        }

        return copyHead;
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}