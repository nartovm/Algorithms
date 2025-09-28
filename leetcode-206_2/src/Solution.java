class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode nextNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        System.out.println(new Solution().reverseList(l1));
    }
}


