package dev.nartov;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{i, map.get(complement)};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1, -2, -3, -4, -5}, -8)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}