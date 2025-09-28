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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();

        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        ListNode start = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                start.next = list1;
                list1 = list1.next;
            } else {
                start.next = list2;
                list2 = list2.next;
            }
            start = start.next;
        }
        if (list1 != null) start.next = list1;
        else if (list2 != null) start.next = list2;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode n3 = new ListNode(4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(1, n2);

        System.out.println(new Solution().mergeTwoLists(l1, n1));
    }
}