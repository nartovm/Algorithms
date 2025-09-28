import java.util.List;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        while (n != 0) {
            fast = fast.next;
            n--;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {

        int length = 0;
        ListNode count = head;
        while (count != null) {
            length++;
            count = count.next;
        }

        int nodeIndex = length - n + 1;
        count = head;

        if (nodeIndex == 1) return head.next;

        for (int i = 1; i < nodeIndex - 1; i++) {
            count = count.next;
        }

        count.next = count.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        new Solution().removeNthFromEnd(n1, 2);

        n1 = new ListNode(1);
        new Solution().removeNthFromEnd(n1, 1);

        n2 = new ListNode(2);
        n1 = new ListNode(1, n2);
        new Solution().removeNthFromEnd(n1, 2);
    }
}