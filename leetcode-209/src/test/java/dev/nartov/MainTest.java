package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int target = 15;
        System.out.println(new Main().minSubArrayLen(target, nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        int target = 213;
        System.out.println(new Main().minSubArrayLen(target, nums));
    }
    @Test
    public void test3() {
        int[] nums = new int[]{2,3,1,2,4,3};
        int target = 7;
        System.out.println(new Main().minSubArrayLen(target, nums));
    }
}