import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }

        while (!queue.isEmpty()) {
            ListNode buf = queue.poll();
            tail.next = buf;
            tail = tail.next;
            if (buf.next != null) queue.add(buf.next);
        }

        return dummy.next;
    }

    public ListNode mergeKLists_slow(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode dummy = new ListNode();

        ListNode pointer = dummy;

        boolean goOn = true;

        ListNode nextNode = null;
        while (goOn) {
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (nextNode == null) {
                    nextNode = lists[i];
                } else {
                    if (lists[i].val < nextNode.val) {
                        nextNode = lists[i];
                    } else if (nextNode == lists[i]) {
                        pointer.next = nextNode;
                        pointer = pointer.next;
                        lists[i] = lists[i].next;
                        nextNode = null;
                    }
                }

            }

            goOn = false;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    goOn = true;
                    break;
                }
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l3_2 = new ListNode(6);
        ListNode l3_1 = new ListNode(2, l3_2);
        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(3, l2_3);
        ListNode l2_1 = new ListNode(1, l2_2);
        ListNode l1_3 = new ListNode(5);
        ListNode l1_2 = new ListNode(4, l1_3);
        ListNode l1_1 = new ListNode(1, l1_2);

        new Solution().mergeKLists(new ListNode[]{l1_1, l2_1, l3_1});
    }
}