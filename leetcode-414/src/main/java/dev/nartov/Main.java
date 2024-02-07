package dev.nartov;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int thirdMax(int[] nums) {
        int[] max = new int[]{nums[0]};

        for (int i = 0; i < nums.length; i++) {
            if (max.length < 3) {
                boolean found = false;
                for (Integer m : max) {
                    if (m == nums[i]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    int[] buf = new int[max.length + 1];
                    System.arraycopy(max, 0, buf, 1, max.length);
                    max = buf;
                    max[0] = Integer.MIN_VALUE;
                }
            }
            addMax(max, nums[i]);
        }
        if (max.length == 3) return max[0];
        else return max[max.length - 1];
    }

    private void addMax(int[] max, int a) {
        for (int i : max) {
            if (i == a) return;
        }
        if (max.length >= 1 && a > max[0]) {
            if (max.length >= 2 && a > max[1]) {
                if (max.length >= 3 && a > max[2]) {
                    max[0] = max[1];
                    max[1] = max[2];
                    max[2] = a;
                } else {
                    max[0] = max[1];
                    max[1] = a;
                }
            } else {
                max[0] = a;
            }
        } else {
            //do nothing
        }
    }
}