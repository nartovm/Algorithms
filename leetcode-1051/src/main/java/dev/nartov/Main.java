package dev.nartov;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int heightChecker(int[] heights) {
        int out = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i]!=expected[i]) out++;
        }
        return out;
    }
}