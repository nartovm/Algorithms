package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) return head;

        ListNode fast = head;

        int size = 1;

        while (fast.next != null) {
            fast = fast.next;
            size++;
        }

        fast.next = head;

        int shift = size - k % size;

        while (shift != 1) {
            head = head.next;
            shift--;
        }

        ListNode buf = head.next;
        head.next = null;
        return buf;
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