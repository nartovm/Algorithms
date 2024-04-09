package org.example;

public class Main {
    public int search(int[] nums, int target) {
        return realSearch(nums, 0, nums.length - 1, target);
    }

    private int realSearch(int[] nums, int l, int r, int target) {
        int mid = l + (r - l) / 2;
        if (l <= r) {
            if (target < nums[mid]) return realSearch(nums, l, mid - 1, target);
            else if (target > nums[mid]) return realSearch(nums, mid + 1, r, target);
            else if (target == nums[mid]) return mid;
        }
        return -1;
    }
}