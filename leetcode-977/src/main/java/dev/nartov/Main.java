package dev.nartov;

class Main {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1) {
            nums[0] = nums[0] * nums[0];
            return nums;
        } else {
            int[] result = new int[nums.length];
            int right = nums.length - 1;
            int left = 0;
            int i = nums.length - 1;
            while (left <= right) {
                int sqrL = nums[left] * nums[left];
                int sqrR = nums[right] * nums[right];
                if (sqrL > sqrR) {
                    result[i--] = sqrL;
                    left++;
                } else {
                    result[i--] = sqrR;
                    right--;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        new Main().sortedSquares(nums);
    }
}