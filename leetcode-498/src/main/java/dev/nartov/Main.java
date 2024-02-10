package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] diagonal = new int[mat.length * mat[0].length];
        int d = 0;


        //for every walkthrough the matrix we should have
        // a sum of indexes of EVERY ELEMENT 1...k,
        // where k - last walkthrough with only one element
        //every walkthrough for the m is in reverse order

        for (int walkthroughIndex = 0; walkthroughIndex <= mat.length + mat[0].length - 2; walkthroughIndex++) {
            if (walkthroughIndex % 2 != 0) {
                //direct
                for (int m = 0; m <= Math.min(mat.length - 1, walkthroughIndex); m++) {
                    int n = walkthroughIndex - m;
                    if (n <= mat[0].length - 1) {
                        diagonal[d++] = mat[m][n];
                    }
                }
            } else {
                for (int m = Math.min(mat.length - 1, walkthroughIndex); m >= 0; m--) {
                    int n = walkthroughIndex - m;
                    if (n <= mat[0].length - 1) {
                        diagonal[d++] = mat[m][n];
                    }
                }
            }

        }
        return diagonal;
    }
}