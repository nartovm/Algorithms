package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;

        HashMap<Integer, Integer> map3_4 = new HashMap<>();
        for (int n3 : nums3) {
            for (int n4 : nums4) {
//                map3_4.merge(n4 + n3, 1, Integer::sum);
                map3_4.put(n4 + n3, map3_4.getOrDefault(n4 + n3, 0) + 1);
            }
        }

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                int sum = n1 + n2;
                if (map3_4.containsKey(-sum)) {
                    count = count + map3_4.get(-sum);
                }
            }
        }
        return count;
    }
}