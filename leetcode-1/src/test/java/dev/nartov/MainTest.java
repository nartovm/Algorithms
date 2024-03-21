package dev.nartov;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums = new int[]{0, 4, 3, 0};
        int target = 0;
        System.out.println(Arrays.toString(new Main().twoSum(nums, target)));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2, 5, 5, 1};
        int target = 10;
        System.out.println(Arrays.toString(new Main().twoSum(nums, target)));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1,3,4,2};
        int target = 6;
        System.out.println(Arrays.toString(new Main().twoSum(nums, target)));
    }

    @Test
    public void test4() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new Main().twoSum(nums, target)));
    }
}