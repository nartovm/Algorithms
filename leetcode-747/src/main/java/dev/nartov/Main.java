package dev.nartov;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int prevMax = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                prevMax = max;
                max = nums[i];
                index = i;
            }
            else if (nums[i] > prevMax) {
                prevMax = nums[i];
            }
        }

        if (prevMax * 2 > max) return -1;
        else return index;
    }
}