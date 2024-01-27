package dev.nartov;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void invertTreeTest() {
        System.out.println(new Solution().invertTree(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }
}