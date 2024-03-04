package dev.nartov;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return false;
        if (head.next == null)
            return true;

        ListNode slow = head;
        ListNode slowAhead = slow.next;
        ListNode preslow = null;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            slow.next = preslow;
            preslow = slow;
            slow = slowAhead;
            slowAhead = slowAhead.next;
        }

        ListNode slow2 = preslow;
        if (fast!=null) slow = slow.next;
        while (slow != null || slow2 != null) {
            if (slow.val!=slow2.val) return false;
            else {
                slow = slow.next;
                slow2 = slow2.next;
            }
        }

        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        if (head == null)
            return false;
        if (head.next == null)
            return true;

        int[] sum = new int[100000];

        int i = -1;
        while (head != null) {
            i++;
            sum[i] = head.val;
            head = head.next;
        }

        int j = 0;
        while (j < i) {
            if (sum[i] != sum[j])
                return false;
            i--;
            j++;
        }
        return true;
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