import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class Solution {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        Integer prev = null;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            if (prev != null && current.val <= prev) {
                return false;
            }

            prev = current.val;

            current = current.right;
        }

        return true;
    }

    public boolean isValidBST_recursive(TreeNode root) {
        return validateRange(root, null, null);
    }

    private boolean validateRange(TreeNode node, Integer left, Integer right) {
        if (node == null) {
            return true;
        } else if ((right == null || node.val < right) && (left == null || node.val > left)) {
            return (validateRange(node.left, left, node.val) && validateRange(node.right, node.val, right));
        } else return false;
    }

    public static void main(String[] args) {
        case1();

//        case2();

//        TreeNode n1_1 = new TreeNode(2147483647);
//        System.out.println(new Solution().isValidBST(n1_1));
    }

    private static void case2() {
        TreeNode n3_4 = new TreeNode(6);
        TreeNode n3_3 = new TreeNode(4);
        TreeNode n3_2 = new TreeNode(2);
        TreeNode n3_1 = new TreeNode(0);
        TreeNode n2_2 = new TreeNode(5, n3_3, n3_4);
        TreeNode n2_1 = new TreeNode(1, n3_1, n3_2);
        TreeNode n1_1 = new TreeNode(3, n2_1, n2_2);
        System.out.println(new Solution().isValidBST(n1_1));
    }

    private static void case1() {
        TreeNode n4_2 = new TreeNode(2);
        TreeNode n4_1 = new TreeNode(0);
        TreeNode n3_3 = new TreeNode(8);
        TreeNode n3_2 = new TreeNode(6);
        TreeNode n3_1 = new TreeNode(1, n4_1, n4_2);
        TreeNode n2_2 = new TreeNode(7, n3_2, n3_3);
        TreeNode n2_1 = new TreeNode(4, n3_1, null);
        TreeNode n1_1 = new TreeNode(5, n2_1, n2_2);
        System.out.println(new Solution().isValidBST(n1_1));
    }
}