package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testThirdMaxCase1() {
        int[] nums = new int[]{2, 2, 3, 1};
        new Main().thirdMax(nums);
    }

    @Test
    public void testThirdMaxCase2() {
        int[] nums = new int[]{1, 1, 2};
        new Main().thirdMax(nums);
    }

    @Test
    public void testThirdMaxCase3() {
        int[] nums = new int[]{1,2,-2147483648};
        new Main().thirdMax(nums);
    }
}