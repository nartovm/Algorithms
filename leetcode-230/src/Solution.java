import java.util.*;

class Solution {
    HashMap<TreeNode, Integer> freqMap = new HashMap<>();

    public int kthSmallest(TreeNode root, int k) {
        TreeNode current = root;
        Integer result = 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (k >= 1) {
            if (freqMap.containsKey(current)) {
                if (freqMap.get(current) >= k - 1) {
                    while (freqMap.get(current) != k - 1) {
                        current = current.left;
                    }
                    k = 0;
                } else {
                    k = k - freqMap.get(current);
                    current = current.right;
                }
            } else {
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }

                current = stack.pop();
                int freq = current.left != null ? freqMap.get(current.left) + 1 : 0;
                freqMap.put(current, freq);
                k--;
            }
            result = current.val;
            current = current.right;
        }
        return result;
    }

    public static void main(String[] args) {
        case2();
        case1();
    }

    private static void case1() {
        TreeNode n3_1 = new TreeNode(2);
        TreeNode n2_2 = new TreeNode(4);
        TreeNode n2_1 = new TreeNode(1, null, n3_1);
        TreeNode n1_1 = new TreeNode(3, n2_1, n2_2);

        System.out.println(new Solution().kthSmallest(n1_1, 1));
    }

    private static void case2() {
        TreeNode n4_1 = new TreeNode(1);
        TreeNode n3_2 = new TreeNode(4);
        TreeNode n3_1 = new TreeNode(2, n4_1, null);
        TreeNode n2_2 = new TreeNode(6);
        TreeNode n2_1 = new TreeNode(3, n3_1, n3_2);
        TreeNode n1_1 = new TreeNode(5, n2_1, n2_2);

        Solution solution = new Solution();

        System.out.println(solution.kthSmallest(n1_1, 6));
        System.out.println(solution.kthSmallest(n1_1, 4));
        System.out.println(solution.kthSmallest(n1_1, 3));

    }
}