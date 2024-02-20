package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int buf = nums[start];
            nums[start] = nums[end];
            nums[end] = buf;
            start++;
            end--;
        }
    }

    public void rotate2(int[] nums, int k) {
        if (k % nums.length == 0) return;
        int[] numsCopy = new int[nums.length];
        System.arraycopy(nums, 0, numsCopy, 0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            int finalIndex = (i + k) % nums.length;
            nums[finalIndex] = numsCopy[i];
        }
    }
}