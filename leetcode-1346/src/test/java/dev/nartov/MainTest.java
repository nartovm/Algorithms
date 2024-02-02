package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main main = new Main();

    @Test
    void testArrayContainsNumberAndDouble() {
        assertTrue(main.checkIfExist(new int[]{10, 2, 5, 3}));
    }

    @Test
    void testArrayDoesNotContainNumberAndDouble() {
        assertFalse(main.checkIfExist(new int[]{3, 1, 7, 11}));
    }

    @Test
    void testArrayWithZero() {
        assertTrue(main.checkIfExist(new int[]{0, 14, 0, 3}));
    }

    @Test
    void testArrayWithNegativeNumbers() {
        assertTrue(main.checkIfExist(new int[]{-2, 0, 10, -4, -1, 20}));
    }

    @Test
    void testEmptyArray() {
        assertFalse(main.checkIfExist(new int[]{}));
    }

    @Test
    void testArrayWithOneElement() {
        assertFalse(main.checkIfExist(new int[]{5}));
    }

    @Test
    void testArrayWithNewCase() {
        assertFalse(main.checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
    }

    @Test
    void testArrayWithNewCase2() {
        assertTrue(main.checkIfExist(new int[]{7, 1, 14, 11}));
    }
}
