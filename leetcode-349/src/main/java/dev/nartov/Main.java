package dev.nartov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int k = 0;
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                if (k == 0 || nums1[i] != nums1[k - 1]) {
                    nums1[k++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(nums1, k);
    }


    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
            }
        }

        int[] arr = new int[set2.size()];
        int i = 0;
        for (Integer n : set2) {
            arr[i++] = n;
        }

        return arr;
    }
}