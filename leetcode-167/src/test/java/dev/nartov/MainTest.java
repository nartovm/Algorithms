package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        new Main().twoSum(numbers,target);
    }

}