import java.util.Arrays;
import java.util.HashMap;

class Solution {
    HashMap<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd) {
        if (inorderStart == inorderEnd) return null;

        TreeNode root = new TreeNode(preorder[preorderStart]);

        int leftInorderEnd = inorderMap.get(root.val);

        int leftPreorderStart = preorderStart + 1;
        int leftPreorderEnd = leftPreorderStart + leftInorderEnd - inorderStart;

        root.left = inorderEnd - inorderStart <= 1 ? null :
                buildTreeHelper(
                        preorder, leftPreorderStart, leftPreorderEnd, inorder, inorderStart, leftInorderEnd);

        int rightInorderStart = leftInorderEnd + 1;

        root.right = inorderEnd - inorderStart <= 1 ? null :
                buildTreeHelper(
                        preorder, leftPreorderEnd, preorderEnd, inorder, rightInorderStart, inorderEnd);
        return root;
    }

    public static void main(String[] args) {
//        new Solution().buildTree(new int[]{1, 2, 3}, new int[]{2, 3, 1});
//        new Solution().buildTree(new int[]{1, 2}, new int[]{2, 1});
        new Solution().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    }
}