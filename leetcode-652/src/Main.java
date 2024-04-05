import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root==null) return null;
        List<TreeNode> result = new LinkedList<>();

        dfs(root, result, new HashMap<>());

        return result;
    }

    private String dfs(TreeNode node, List<TreeNode> result, HashMap<String, Integer> frequencies) {
        if (node==null) return null;

        String key = node.val + ',' + dfs(node.left, result, frequencies) + ',' + dfs(node.right, result, frequencies);

        int freq = frequencies.getOrDefault(key,0);

        frequencies.put(key, freq + 1);

        if (freq == 1) result.add(node);

        return key;
    }
}
