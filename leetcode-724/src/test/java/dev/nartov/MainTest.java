package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        int[] nums = new int[]{2,1,-1};
        System.out.println(new Main().pivotIndex(nums));
    }

    @Test
    public void test2(){
        int[] nums = new int[]{-1,1,2};
        System.out.println(new Main().pivotIndex(nums));
    }

}