import com.sun.source.tree.Tree;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currentLevelValues = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode node = queue.poll();
                    currentLevelValues.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                result.add(currentLevelValues);
            }
        }

        return result;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<TreeNode>> listOfLevels = new ArrayList<>();

        if (root != null) {
            List<Integer> initialListOfValues = Collections.singletonList(root.val);
            List<TreeNode> initialListOfNodes = Collections.singletonList(root);

            result.add(initialListOfValues);
            listOfLevels.add(initialListOfNodes);

            for (int currentLevel = 0; currentLevel < listOfLevels.size(); currentLevel++) {
                List<TreeNode> list = new ArrayList<>();
                List<Integer> listOfValues = new ArrayList<>();
                for (TreeNode node : listOfLevels.get(currentLevel)) {
                    if (node.left != null) {
                        list.add(node.left);
                        listOfValues.add(node.left.val);
                    }
                    if (node.right != null) {
                        list.add(node.right);
                        listOfValues.add(node.right.val);
                    }
                }
                if (!listOfValues.isEmpty()) {
                    listOfLevels.add(list);
                    result.add(listOfValues);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().levelOrder(null));
        TreeNode n4_2 = new TreeNode(5);
        TreeNode n4_1 = new TreeNode(3);
        TreeNode n3_4 = new TreeNode(9);
        TreeNode n3_3 = new TreeNode(7);
        TreeNode n3_2 = new TreeNode(4, n4_1, n4_2);
        TreeNode n3_1 = new TreeNode(0);
        TreeNode n2_2 = new TreeNode(8, n3_3, n3_4);
        TreeNode n2_1 = new TreeNode(2, n3_1, n3_2);
        TreeNode n1_1 = new TreeNode(6, n2_1, n2_2);

        System.out.println(new Solution().levelOrder(n1_1));
    }
}