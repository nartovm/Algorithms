import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n4 = new ListNode(-4);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(0, n3);
        ListNode n1 = new ListNode(1, n2);
        n4.next = n1;

        System.out.println(new Solution().hasCycle(n1));
    }
}