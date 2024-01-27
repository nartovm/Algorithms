package dev.nartov;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void checkTreeTest() {
        assertTrue(new Solution().checkTree(new TreeNode(10, new TreeNode(4), new TreeNode(6))));
        assertFalse(new Solution().checkTree(new TreeNode(5, new TreeNode(3), new TreeNode(1))));
    }
}