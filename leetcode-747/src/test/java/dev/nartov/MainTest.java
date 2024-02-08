package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums = new int[]{3,6,1,0};
        System.out.println(new Main().dominantIndex(nums));
    }
    @Test
    public void test2() {
        int[] nums = new int[]{0,0,3,2};
        System.out.println(new Main().dominantIndex(nums));
    }
    @Test
    public void test3() {
        int[] nums = new int[]{1,0};
        System.out.println(new Main().dominantIndex(nums));
    }
}