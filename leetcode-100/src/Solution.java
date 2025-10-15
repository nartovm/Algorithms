import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if (node1 == null && node2 == null) {
                continue;
            } else if (node1 == null || node2 == null) {
                return false;
            }
            else if (node1.val == node2.val) {
                queue.add(node1.left);
                queue.add(node2.left);
                queue.add(node1.right);
                queue.add(node2.right);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode p3 = new TreeNode(3);
        TreeNode p2 = new TreeNode(2);
        TreeNode p1 = new TreeNode(1, p2, p3);
        TreeNode q3 = new TreeNode(3);
        TreeNode q2 = new TreeNode(2);
        TreeNode q1 = new TreeNode(1, q2, q3);
        new Solution().isSameTree(p1, q1);
    }
}