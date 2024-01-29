package dev.nartov;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentLength = 0;
        int maxLength = 0;
        for (int num : nums) {
            if (num == 1) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        return maxLength;
    }
}
