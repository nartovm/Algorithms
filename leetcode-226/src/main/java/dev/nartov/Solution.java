package dev.nartov;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invertTree(root.left);
            invertTree(root.right);
            if (root.left != null || root.right != null) {
                TreeNode buf = root.left;
                root.left = root.right;
                root.right = buf;
            }
        }
        return root;
    }
}