package dev.nartov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testRemoveElementSingleMatch() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expectedLength = 2; // After removal, array should contain [2, 2]
        assertEquals(expectedLength, solution.removeElement(nums, val));
    }

    @Test
    public void testRemoveElementNoMatch() {
        int[] nums = {1, 2, 3, 4};
        int val = 5;
        int expectedLength = 4; // No removal, array remains unchanged
        assertEquals(expectedLength, solution.removeElement(nums, val));
    }

    @Test
    public void testRemoveElementAllMatch() {
        int[] nums = {2, 2, 2, 2};
        int val = 2;
        int expectedLength = 0; // All elements removed
        assertEquals(expectedLength, solution.removeElement(nums, val));
    }

    @Test
    public void testRemoveElementEmptyArray() {
        int[] nums = {};
        int val = 1;
        int expectedLength = 0; // Array is empty
        assertEquals(expectedLength, solution.removeElement(nums, val));
    }

    @Test
    public void testRemoveElementMixedValues() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expectedLength = 5; // After removal, array should contain [0, 1, 3, 0, 4]
        assertEquals(expectedLength, solution.removeElement(nums, val));
    }
}

