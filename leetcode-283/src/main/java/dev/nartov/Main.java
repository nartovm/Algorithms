package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zero] = nums[i];
                zero++;
            }
        }
        for (int i = zero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}