package dev.nartov;

import java.util.HashSet;

public class Main {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove((Object) num);
            } else set.add(num);
        }

        int res = 0;
        for (Integer i : set) {
            res = i;
        }
        return res;
    }
}