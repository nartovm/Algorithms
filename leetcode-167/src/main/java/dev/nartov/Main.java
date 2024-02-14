package dev.nartov;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i != j) {
            if (numbers[i] + numbers[j] == target) return new int[]{i + 1, j + 1};
            else if (numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        return new int[]{};
    }

    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            int dif = target - n;
            for (int j = i + 1; j < numbers.length; j++) {
                int n2 = numbers[j];

                if (n2 == dif) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    i = -1;
                    break;
                }
                if (n2 > dif) {
                    break;
                }
            }
            if (i == -1) break;
//            if (n > target) {
//                break;
//            }
        }
        return result;
    }
}