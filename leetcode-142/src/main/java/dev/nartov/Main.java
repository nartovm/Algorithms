package dev.nartov;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        set.add(head);
        while (true) {
            if (head == null) return null;
            head = head.next;
            if (!set.add(head)) {
                return head;
            }
        }
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}