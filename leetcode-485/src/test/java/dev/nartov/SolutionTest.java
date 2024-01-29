package dev.nartov;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findMaxConsecutiveOnes() {
        int[] nums = new int[] {1,1,0,1,1,1};
        new Solution().findMaxConsecutiveOnes(nums);
    }
}