package dev.nartov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main main = new Main();

    @Test
    void testValidMountainArray() {
        assertTrue(main.validMountainArray(new int[]{0, 3, 2, 1}));
    }

    @Test
    void testNotLongEnough() {
        assertFalse(main.validMountainArray(new int[]{2, 1}));
    }

    @Test
    void testIncreasingOnly() {
        assertFalse(main.validMountainArray(new int[]{0, 1, 2, 3}));
    }

    @Test
    void testDecreasingOnly() {
        assertFalse(main.validMountainArray(new int[]{3, 2, 1, 0}));
    }

    @Test
    void testInvalidMountain() {
        assertFalse(main.validMountainArray(new int[]{0, 3, 3, 2, 1}));
    }

    @Test
    void testValidMountainAtEnds() {
        assertTrue(main.validMountainArray(new int[]{1, 3, 2}));
    }

    @Test
    void testValidMountainNoSummit() {
        assertFalse(main.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }

    @Test
    void testValidMountainNoSummitDecreasing() {
        assertFalse(main.validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }
}
