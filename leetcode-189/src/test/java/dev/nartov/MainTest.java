package dev.nartov;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new Main().rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}