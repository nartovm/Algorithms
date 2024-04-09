package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        new Main().search(nums, target);
    }
}