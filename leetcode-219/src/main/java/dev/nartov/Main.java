package dev.nartov;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size()>k) set.remove(nums[i-k]);
        }
        return false;
    }
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicate_slow(int[] nums, int k) {
        if (k == 0) return false;

        int i = 0;
        int j = 1;

        while (i < nums.length && j < nums.length) {
            if (nums[i] != nums[j]) {
                if (j - i == k || j == nums.length - 1) {
                    i++;
                    j = i + 1;
                } else {
                    j++;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}