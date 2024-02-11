package dev.nartov;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
//        if (matrix.length==1) return new ArrayList<>(matrix[0]);

        // Right    j ascending, iMin
        // Down     i descending, jMax
        // Left     j descending, iMax
        // Up       i descending, jMin
        int iMin = 0;
        int jMin = 0;
        int iMax = matrix.length - 1;
        int jMax = matrix[0].length - 1;
        int count = 0;
        boolean horizontal = true;
        boolean down = true;
        boolean right = true;


        while (count != matrix.length * matrix[0].length) {
            if (horizontal) {
                if (right) {
                    for (int j = jMin; j <= jMax; j++) {
                        list.add(matrix[iMin][j]);
                        count++;
                    }
                    iMin++;
                }
                else {
                    for (int j = jMax; j >= jMin; j--) {
                        list.add(matrix[iMax][j]);
                        count++;
                    }
                    iMax--;
                }
                right=!right;
            }
            else {
                if (down) {
                    for (int i = iMin; i <= iMax; i++) {
                        list.add(matrix[i][jMax]);
                        count++;
                    }
                    jMax--;
                }
                else {
                    for (int i = iMax; i >= iMin; i--) {
                        list.add(matrix[i][jMin]);
                        count++;
                    }
                    jMin++;
                }
                down=!down;
            }
            horizontal = !horizontal;
        }
        return list;
    }
}