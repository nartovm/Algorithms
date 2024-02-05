package dev.nartov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testMoveZeroesCase1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        new Main().moveZeroes(nums);
        Assertions.assertArrayEquals(nums, expected);
    }
}