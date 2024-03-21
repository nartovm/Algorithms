package dev.nartov;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)){
                int index = map.get(b);
                if (index != i) {
                    return new int[]{i, index};
                }
            }
            map.put(a, i);
        }
        return new int[]{};
    }
}