/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondList = slow.next;
        slow.next = null;

        ListNode next;
        ListNode prev = null;
        ListNode curr = secondList;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        secondList = prev;

        while (head != null && secondList != null) {
            ListNode headNext = head.next;
            ListNode secondListNext = secondList.next;
            head.next = secondList;
            head.next.next = headNext;
            head = headNext;
            secondList = secondListNext;
        }

    }

    public void reorderList2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode last = slow;
        ListNode next = slow.next;
        while (next != null) {
            slow = next;
            next = slow.next;
            slow.next = last;
            last = slow;
        }

        ListNode initial = head;
        while (head != last) {
            ListNode headNext = head.next;
            ListNode lastNext = last.next;
            head.next = last;
            last.next = headNext;
            head = headNext;
            last = lastNext;
        }
        last.next = null;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        new Solution().reorderList(n1);
    }
}