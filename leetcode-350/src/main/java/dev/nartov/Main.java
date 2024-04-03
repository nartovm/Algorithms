package dev.nartov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int n : nums1) {
            map1.merge(n, 1, Integer::sum);
        }

        int i = 0;
        for (int n : nums2) {
            Integer f = map1.get(n);
            if (f != null && f > 0) {
                nums1[i++] = n;
                map1.put(n, f - 1);
            }
        }
        return Arrays.copyOf(nums1, i);
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int n : nums1) {
            map1.merge(n, 1, Integer::sum);
        }

        for (int n : nums2) {
            map2.merge(n, 1, Integer::sum);
        }

        int i = 0;

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            Integer n = entry.getKey();
            Integer f = entry.getValue();
            for (int j = 0; j < Math.min(f, map2.getOrDefault(n, 0)); j++) {
                nums1[i++] = n;
            }
        }
        return Arrays.copyOf(nums1, i);
    }
}