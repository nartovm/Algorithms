package dev.nartov;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testCase1() {
        int[] digits = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(new Main().plusOne(digits)));
    }

    @Test
    public void testCase2() {
        int[] digits = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(new Main().plusOne(digits)));
    }

}