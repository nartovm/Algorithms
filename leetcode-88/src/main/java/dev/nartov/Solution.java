package dev.nartov;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);
        int n1 = 0;
        int n2 = 0;
        int nc = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nc == nums1_copy.length) {
                System.arraycopy(nums2, n2, nums1, i, nums2.length - n2);
                break;
            } else if (n2 == nums2.length) {
                System.arraycopy(nums1_copy, nc, nums1, i, nums1_copy.length - nc);
                break;
            }
            if (nums1_copy[nc] < nums2[n2]) {
                nums1[n1] = nums1_copy[nc];
                nc++;
            } else {
                nums1[n1] = nums2[n2];
                n2++;
            }
            n1++;
        }
    }
}