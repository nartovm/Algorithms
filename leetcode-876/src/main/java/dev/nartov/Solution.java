package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        int middle = 0;
        int numberOfNodes = findNumberOfNodes(head);
        middle = numberOfNodes / 2 + 1;

        if (middle > 1) {
            for (int i = 1; i < numberOfNodes; i++) {
                if (i == middle) break;
                middleNode = middleNode.next;
            }
        }
        return middleNode;
    }

    public int findNumberOfNodes(ListNode node) {
        if (node.next != null) return findNumberOfNodes(node.next) + 1;
        else return 1;
    }
}