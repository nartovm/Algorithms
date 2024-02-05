package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testSortArrayByParityCase1() {
        int[] nums = new int[]{3,1,2,4};
        new Main().sortArrayByParity(nums);
    }
}