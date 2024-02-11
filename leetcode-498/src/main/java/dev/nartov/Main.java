package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        if (mat.length==1) return mat[0];

        int[] diagonal = new int[mat.length * mat[0].length];
        int d = 0;

        //for every walkthrough the matrix we should have
        // a sum of indexes of EVERY ELEMENT 1...k,
        // where k - last walkthrough with only one element
        //every walkthrough for the m is in reverse order

        for (int walkthroughIndex = 0; walkthroughIndex <= mat.length + mat[0].length - 2; walkthroughIndex++) {
            int minIndex = Math.min(mat.length - 1, walkthroughIndex);
            int maxIndex = Math.max(0, walkthroughIndex - (mat[0].length - 1));
            if (walkthroughIndex % 2 != 0) {
                //direct
                for (int m = maxIndex; m <= minIndex; m++) {
                    int n = walkthroughIndex - m;
                    diagonal[d++] = mat[m][n];
                }
            } else {
                for (int m = minIndex; m >= maxIndex; m--) {
                    int n = walkthroughIndex - m;
                    diagonal[d++] = mat[m][n];
                }
            }
        }
        return diagonal;
    }
}