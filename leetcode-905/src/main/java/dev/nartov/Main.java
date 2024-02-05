package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] sortArrayByParity(int[] nums) {
        int k = nums.length - 1;
        int i = 0;
        while (i <= k) {
            if (nums[i] % 2 == 0 && nums[k] % 2 != 0) { //even-odd
                i++;
                k--;
            } else if (nums[i] % 2 == 0 && nums[k] % 2 == 0) { //even-even
                i++;
            } else if(nums[i] % 2 != 0 && nums[k] % 2 != 0) { //odd-odd
                k--;
            }
            else { //odd-even
                int buf = nums[i];
                nums[i] = nums[k];
                nums[k] = buf;
                i++;
                k--;
            }
        }
        return nums;
    }
}