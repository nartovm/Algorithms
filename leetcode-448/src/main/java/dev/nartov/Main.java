package dev.nartov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i] - 1);
            if (nums[index] > 0)
                nums[index] = -1 * nums[index];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }
        return list;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = nums[nums.length - 1] + 1; i < nums.length + 1; i++) {
            list.add(i);
        }

        for (int i = 1; i < nums[0]; i++) {
            list.add(i);
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                for (int j = nums[i - 1] + 1; j < nums[i]; j++) {
                    list.add(j);
                }
            }
        }

        return list;
    }
}