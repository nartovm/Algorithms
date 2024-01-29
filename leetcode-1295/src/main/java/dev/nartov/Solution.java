package dev.nartov;

class Solution {
    public int findNumbers(int[] nums) {
        int numberOfEven = 0;
        for (int num : nums) {
            if (isEvenNumberOfDigits(num)) {
                numberOfEven++;
            }
        }
        return numberOfEven;
    }

    private boolean isEvenNumberOfDigits(int n) {
        return numberOfDigits(n) % 2 == 0;
    }

    private int numberOfDigits(int n) {
        int i = 0;
        while (n > 0) {
            n = n / 10;
            i++;
        }
        return i;
    }

    public int findNumbers2(int[] nums) {
        int numberOfEven = 0;
        for (int num : nums) {
            if ((1 + (int)Math.floor(Math.log10(num))) % 2 == 0) {
                numberOfEven++;
            }
        }
        return numberOfEven;
    }
}