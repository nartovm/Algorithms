package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int pivotIndex(int[] nums) {
        int index = -1;
        int rightSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (i != 0) {
                leftSum += nums[i - 1];
            }
            if (leftSum == rightSum) {
                index = i;
                break;
            }
        }
        return index;
    }
}