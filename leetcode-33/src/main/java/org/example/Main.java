package org.example;

public class Main {
    public int search(int[] nums, int target) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        int k = nums.length - 1 - maxIndex;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            int index = (mid - k) >= 0 ? mid - k : nums.length + (mid - k);

            if (target < nums[index]) right = mid - 1;
            else if (target > nums[index]) left = mid + 1;
            else return index;
        }
        return -1;
    }
}