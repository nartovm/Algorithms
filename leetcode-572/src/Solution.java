class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null) {
            return false;
        } else {
            if (isTreeEqual(root, subRoot)) {
                return true;
            } else {
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
            }
        }
    }

    private boolean isTreeEqual(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return (isTreeEqual(node1.left, node2.left) && isTreeEqual(node1.right, node2.right));
    }

    public static void main(String[] args) {
        test0();
    }

    private static void test0() {
        TreeNode r5 = new TreeNode(2);
        TreeNode r4 = new TreeNode(1);
        TreeNode r3 = new TreeNode(5);
        TreeNode r2 = new TreeNode(4, r4, r5);
        TreeNode r1 = new TreeNode(3, r2, r3);

        TreeNode s5 = new TreeNode(2);
        TreeNode s4 = new TreeNode(1);
        TreeNode s2 = new TreeNode(4, s4, s5);
        System.out.println(new Solution().isSubtree(r1, s2));
    }


    private static void test1() {
        TreeNode r5 = new TreeNode(1);
        TreeNode r4 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r2 = new TreeNode(4, r4, r5);
        TreeNode r1 = new TreeNode(5, r2, r3);

        TreeNode s5 = new TreeNode(1);
        TreeNode s4 = new TreeNode(2);
        TreeNode s2 = new TreeNode(4, s4, s5);
        System.out.println(new Solution().isSubtree(r1, s2));
    }

    private static void test2() {
        TreeNode r5 = new TreeNode(1);
        TreeNode r4 = new TreeNode(2);
        TreeNode r3 = new TreeNode(5, r4, null);
        TreeNode r2 = new TreeNode(4, r5, null);
        TreeNode r1 = new TreeNode(3, r2, r3);

        TreeNode s5 = new TreeNode(2);
        TreeNode s4 = new TreeNode(1);
        TreeNode s2 = new TreeNode(3, s4, s5);
        System.out.println(new Solution().isSubtree(r1, s2));
    }
}