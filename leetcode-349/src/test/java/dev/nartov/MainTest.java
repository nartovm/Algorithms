package dev.nartov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] nums1 = new int[] {4,7,9,7,6,7};
        int[] nums2 = new int[] {5,0,0,6,1,6,2,2,4};

        System.out.println(Arrays.toString(new Main().intersection(nums1, nums2)));
    }

    @Test
    public void test2() {
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};

        System.out.println(Arrays.toString(new Main().intersection(nums1, nums2)));
    }

}