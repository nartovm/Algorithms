package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateZerosTest {

    @Test
    public void testNormalCase() {
        Solution solution = new Solution();
        int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, input);
    }

    @Test
    public void testNormalCase2() {
        Solution solution = new Solution();
        int[] input = {8, 4, 5, 0, 0, 0, 0, 7};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{8, 4, 5, 0, 0, 0, 0, 0}, input);
    }

    @Test
    public void testNormalCase3() {
        Solution solution = new Solution();
        int[] input = {9,9,9,4,8,0,0,3,7,2,0,0,0,0,9,1,0,0,1,1,0,5,6,3,1,6,0,0,2,3,4,7,0,3,9,3,6,5,8,9,1,1,3,2,0,0,7,3,3,0,5,7,0,8,1,9,6,3,0,8,8,8,8,0,0,5,0,0,0,3,7,7,7,7,5,1,0,0,8,0,0};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{9,9,9,4,8,0,0,0,0,3,7,2,0,0,0,0,0,0,0,0,9,1,0,0,0,0,1,1,0,0,5,6,3,1,6,0,0,0,0,2,3,4,7,0,0,3,9,3,6,5,8,9,1,1,3,2,0,0,0,0,7,3,3,0,0,5,7,0,0,8,1,9,6,3,0,0,8,8,8,8,0}, input);
    }
    @Test
    public void testAllZeros() {
        Solution solution = new Solution();
        int[] input = {0, 0, 0, 0};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{0, 0, 0, 0}, input);
    }

    @Test
    public void testNoZeros() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{1, 2, 3, 4}, input);
    }

    @Test
    public void testSingleZero() {
        Solution solution = new Solution();
        int[] input = {0};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{0}, input);
    }

    @Test
    public void testSingleNonZeroNumber() {
        Solution solution = new Solution();
        int[] input = {1};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{1}, input);
    }

    @Test
    public void testZerosAtTheEnd() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 0, 0};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, input);
    }

    @Test
    public void testEmptyArray() {
        Solution solution = new Solution();
        int[] input = {};
        solution.duplicateZeros(input);
        assertArrayEquals(new int[]{}, input);
    }

//    @Test
//    public void testSpecialCharacters() {
//        Solution solution = new Solution();
//        int[] input = {1, 0, 2, 0, 3};
//        solution.duplicateZeros(input);
//        assertArrayEquals(new int[]{1, 0, 0, 2, 0}, input);
//    }

    // Define the Solution class and duplicateZeros method here for the tests to work
}
