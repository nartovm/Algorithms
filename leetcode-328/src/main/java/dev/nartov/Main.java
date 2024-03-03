package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;

        ListNode headEven = head.next;

        ListNode odd = null;
        ListNode even = null;
        ListNode curr = head;

        for (int i = 1; ; i++) {
            if (curr == null) break;
            if (i % 2 == 0) {
                if (even != null) {
                    even.next = curr;
                    even = even.next;
                } else {
                    even = curr;
                }

            } else {
                if (odd != null) {
                    odd.next = curr;
                    odd = odd.next;
                } else {
                    odd = curr;
                }
            }
            curr = curr.next;
        }
        even.next = null;
        odd.next = headEven;
        return head;
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