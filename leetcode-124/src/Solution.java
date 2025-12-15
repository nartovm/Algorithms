class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        depthFirstSearch(root);
        return maxSum;
    }

    private int depthFirstSearch(TreeNode node) {
        if (node == null) return 0;
        int leftGain = Math.max(depthFirstSearch(node.left), 0);
        int rightGain = Math.max(depthFirstSearch(node.right), 0);
        maxSum = Math.max(node.val + leftGain + rightGain, maxSum);
        return node.val + Math.max(leftGain, rightGain);
    }


    public static void main(String[] args) {
        TreeNode n3_2 = new TreeNode(7);
        TreeNode n3_1 = new TreeNode(15);
        TreeNode n2_2 = new TreeNode(20, n3_1, n3_2);
        TreeNode n2_1 = new TreeNode(9);
        TreeNode n1_1 = new TreeNode(-10, n2_1, n2_2);

        System.out.println(new Solution().maxPathSum(n1_1));
    }
}