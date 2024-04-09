package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        new Main().topKFrequent(nums,k);
    }
}