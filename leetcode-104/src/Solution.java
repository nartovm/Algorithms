import java.util.*;

class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                levelSize--;
            }
            depth++;
        }
        return depth;
    }

    public int maxDepth_iterative_map(TreeNode root) {
        HashMap<Integer, ArrayList<TreeNode>> map = new HashMap<>();
        ArrayList firstLevel = new ArrayList();
        firstLevel.add(root);
        map.put(1, firstLevel);

        int currentLevel = 1;
        while (true) {
            ArrayList<TreeNode> levelList = map.get(currentLevel);
            ArrayList<TreeNode> nextLevelList = new ArrayList<>();
            for (TreeNode node : levelList) {
                if (node == null) {
                    continue;
                }
                nextLevelList.add(node.left);
                nextLevelList.add(node.right);
            }
            if (nextLevelList.isEmpty()) {
                return currentLevel - 1;
            } else {
                map.remove(currentLevel);
                map.put(++currentLevel, nextLevelList);
            }
        }
    }

    public int maxDepth_recursive(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth_recursive(root.left), maxDepth_recursive(root.right));
        }
    }

    public static void main(String[] args) {
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(15);
        TreeNode n3 = new TreeNode(20, n6, n7);
        TreeNode n2 = new TreeNode(9);
        TreeNode n1 = new TreeNode(3, n2, n3);
        new Solution().maxDepth(n1);
    }
}