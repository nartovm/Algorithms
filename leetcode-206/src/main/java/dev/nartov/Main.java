package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode second = head.next;
        ListNode buf;

        head.next = null;
        while (second != null) {
            buf = second.next;
            second.next = head;
            head = second;
            second = buf;
        }
        return second;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}