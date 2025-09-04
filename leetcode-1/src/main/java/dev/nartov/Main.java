package dev.nartov;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int complement = target - n;
            Integer i2 = map.get(complement);
            if (i2 != null) {
                return new int[]{i,i2};
            }
            map.put(n, i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().twoSum(new int[]{3, 2, 4}, 6)));
    }
}