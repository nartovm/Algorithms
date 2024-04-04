package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        int[] nums = new int[]{1,2,3,1};
        int k = 3;
        System.out.println(new Main().containsNearbyDuplicate(nums, k));
    }

}