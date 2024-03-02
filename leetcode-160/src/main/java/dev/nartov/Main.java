package dev.nartov;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a.next == null ? headB : a.next;
            b = b.next == null ? headA : b.next;
        }

        return a;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        if (headA == null || headB == null) return null;

        while (headB != null) {
            if (!set.add(headB)) return headB;
            headB = headB.next;
        }

        while (headA != null) {
            if (!set.add(headA)) return headA;
            headA = headA.next;
        }


        return null;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}