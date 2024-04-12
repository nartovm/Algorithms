package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        new Main().search(nums, target);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3,1};
        int target = 0;
        new Main().search(nums, target);
    }
}