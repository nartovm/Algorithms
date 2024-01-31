package dev.nartov;

import dev.nartov.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testNormalCase() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testNums1Empty() {
        Solution solution = new Solution();
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        solution.merge(nums1, 0, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    public void testMergeWithSpecificInput() {
        Solution solution = new Solution();
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        solution.merge(nums1, 1, nums2, 1);
        assertArrayEquals(new int[]{1, 2}, nums1);
    }


}
