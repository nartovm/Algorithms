import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (q.val > root.val && p.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (q.val < root.val && p.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else return root;
    }

    public TreeNode lowestCommonAncestor_it(TreeNode root, TreeNode p, TreeNode q) {
        for (; ; ) {
            if (q.val > root.val && p.val > root.val) {
                root = root.right;
            } else if (q.val < root.val && p.val < root.val) {
                root = root.left;
            } else return root;
        }
    }

    public static void main(String[] args) {
//        TreeNode n4_2 = new TreeNode(5);
//        TreeNode n4_1 = new TreeNode(3);
//        TreeNode n3_4 = new TreeNode(9);
//        TreeNode n3_3 = new TreeNode(7);
//        TreeNode n3_2 = new TreeNode(4, n4_1, n4_2);
//        TreeNode n3_1 = new TreeNode(0);
//        TreeNode n2_2 = new TreeNode(8, n3_3, n3_4);
//        TreeNode n2_1 = new TreeNode(2, n3_1, n3_2);
//        TreeNode n1_1 = new TreeNode(6, n2_1, n2_2);
//
//        System.out.println(new Solution().lowestCommonAncestor(n1_1, n4_1, n4_2).val);

//        System.out.println(new Solution().lowestCommonAncestor(n1_1, n2_1, n2_2).val);
//        System.out.println(new Solution().lowestCommonAncestor(n1_1, n2_1, n3_2).val);
//
//
//        TreeNode b3_1 = new TreeNode(2);
//        TreeNode b2_2 = new TreeNode(4);
//        TreeNode b2_1 = new TreeNode(1, null, b3_1);
//        TreeNode b1_1 = new TreeNode(3, b2_1, b2_2);
//        System.out.println(new Solution().lowestCommonAncestor(b1_1, b3_1, b2_2).val);

        // Уровень 9
        TreeNode n9_1 = new TreeNode(5);

        // Уровень 8
        TreeNode n8_1 = new TreeNode(6, n9_1, null);
        TreeNode n8_2 = new TreeNode(8);
        TreeNode n8_3 = new TreeNode(10);
        TreeNode n8_4 = new TreeNode(16); // Узел без видимых детей

        // Уровень 7
        TreeNode n7_1 = new TreeNode(7, n8_1, n8_2);
        TreeNode n7_2 = new TreeNode(11, n8_3, n8_4);
        TreeNode n7_3 = new TreeNode(28);

        // Уровень 6
        TreeNode n6_1 = new TreeNode(3);
        TreeNode n6_2 = new TreeNode(9, n7_1, n7_2);
        TreeNode n6_3 = new TreeNode(25);
        TreeNode n6_4 = new TreeNode(27, null, n7_3);
        TreeNode n6_5 = new TreeNode(33);

        // Уровень 5
        TreeNode n5_1 = new TreeNode(4, n6_1, n6_2);
        TreeNode n5_2 = new TreeNode(26, n6_3, n6_4);
        TreeNode n5_3 = new TreeNode(31);
        TreeNode n5_4 = new TreeNode(34, null, n6_5);

        // Уровень 4
        TreeNode n4_1 = new TreeNode(0);
        TreeNode n4_2 = new TreeNode(2, null, n5_1);
        TreeNode n4_3 = new TreeNode(29, n5_2, null);
        TreeNode n4_4 = new TreeNode(32, n5_3, n5_4);
        TreeNode n4_5 = new TreeNode(36);
        TreeNode n4_6 = new TreeNode(45);
        TreeNode n4_7 = new TreeNode(47);

        // Уровень 3
        TreeNode n3_1 = new TreeNode(1, n4_1, n4_2);
        TreeNode n3_2 = new TreeNode(30, n4_3, n4_4);
        TreeNode n3_3 = new TreeNode(35, n3_2, n4_5);
        TreeNode n3_4 = new TreeNode(38);
        TreeNode n3_5 = new TreeNode(40);
        TreeNode n3_6 = new TreeNode(43);
        TreeNode n3_7 = new TreeNode(46, n4_6, n4_7);
        TreeNode n3_8 = new TreeNode(49);

        // Уровень 2
        TreeNode n2_1 = new TreeNode(24, n3_1, n3_3);
        TreeNode n2_2 = new TreeNode(39, n3_4, n3_5);
        TreeNode n2_3 = new TreeNode(42, null, n3_6);
        TreeNode n2_4 = new TreeNode(48, n3_7, n3_8);

        // Уровень 1
        TreeNode n1_1 = new TreeNode(37, n2_1, n2_2);
        TreeNode n1_2 = new TreeNode(44, n2_3, n2_4);

        // Уровень 0 (Корень)
        TreeNode n0_1 = new TreeNode(41, n1_1, n1_2);

        System.out.println(new Solution().lowestCommonAncestor(n0_1, n3_5, n3_7).val);
    }
}